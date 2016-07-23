/**
 * @FileName: ConstDef.java
 * @Package: com.ziroom.cleaning.common.constant
 * @author sence
 * @created 9/14/2015 11:20 PM
 * <p/>
 * Copyright 2015 ziroom
 */
package com.pub.open.commons.constant;

/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author sence
 * @version 1.0
 * @since 1.0
 */
public class ConstDef {


    /**
     * 系统通用编码
     */
    public static final String DEFAULT_CHARSET = "UTF-8";
    /**
     * 错误日志格式
     */
    public static final String ERROR_LOG_FORMAT = "CLASS:[{}],METHOD:[{}],PARAM:[{}],ERROR:";
    /**
     * 数据采集日志格式
     */
    public static final String INFO_LOG_FORMAT = "CLASS:[{}],METHOD:[{}],PARAM:[{}]";
    /**
     * SOA
     */
    public static final String SOA_LOG_FORMAT = "SOA INVOKE PARAM:[{}],ERROR:[{}]";
    /**
     * 请求日志记录格式
     */
    public static final String LOG_REQUEST_FORMAT = "URL:[{}],PARAM:[{}],TOKEN:[{}],UID:[{}]";

    /**
     *城市编码NAME
     */
    public static final String CITY_CODE_KEY = "cityCode";

    /**
     * 私有构造
     */
    private ConstDef() {

    }
    

}
