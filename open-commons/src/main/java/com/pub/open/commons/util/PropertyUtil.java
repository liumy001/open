package com.pub.open.commons.util;

import com.pub.open.commons.constant.ConstDef;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Properties;


/**
 * <p>TODO</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author jiangn
 * @version 1.0
 * @since 1.0
 */
public class PropertyUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropertyUtil.class);
    private static ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
    private static Properties properties = new Properties();

    //加载属性文件
    static {
        try {
            Resource[] resources = resolver.getResources("*.properties");
            for (Resource resource : resources) {
                InputStream is = null;
                try {
                    is = resource.getInputStream();
                    properties.load(is);
                } catch (IOException ex) {
                    LOGGER.error(ConstDef.ERROR_LOG_FORMAT, PropertyUtil.class.getName(), "static loadResources", ex);
                } finally {
                    IOUtils.closeQuietly(is);
                }
            }
        } catch (IOException e) {
            LOGGER.error(ConstDef.ERROR_LOG_FORMAT, PropertyUtil.class.getName(), "static loadResources", e);
        }
    }

    public static String getValue(String key) {
        String systemProperty = System.getProperty(key);
        if (systemProperty != null) {
            return systemProperty;
        }
        return properties.getProperty(key);
    }

    public static String getString(String key) {
        String value = getValue(key);
        return ((value != null) ? value : "");
    }

    public static String getString(String key, String defaultValue) {
        String value = getValue(key);
        return ((value != null) ? value : defaultValue);
    }

    public static Integer getInteger(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return Integer.valueOf(value);
    }

    public static Integer getInteger(String key, Integer defaultValue) {
        String value = getValue(key);
        return ((value != null) ? Integer.valueOf(value) : defaultValue);
    }

    public static Double getDouble(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return Double.valueOf(value);
    }

    public static Double getDouble(String key, Double defaultValue) {
        String value = getValue(key);
        return ((value != null) ? Double.valueOf(value) : defaultValue);
    }

    public static Boolean getBoolean(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return Boolean.valueOf(value);
    }

    public static Boolean getBoolean(String key, boolean defaultValue) {
        String value = getValue(key);
        return Boolean.valueOf((value != null) ? Boolean.valueOf(value)
                .booleanValue() : defaultValue);
    }

    public static Long getLong(String key) {
        String value = getValue(key);
        if (value == null) {
            throw new NoSuchElementException();
        }
        return Long.valueOf(value);
    }

    public static Long getLong(String key, Long defaultValue) {
        String value = getValue(key);
        return Long.valueOf((value != null) ? Long.valueOf(value) : defaultValue);
    }

}
