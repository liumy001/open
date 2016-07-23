package com.pub.open.commons.util;


import com.asura.framework.base.util.Check;
import com.pub.open.commons.constant.ConstProperty;
import com.pub.open.commons.constant.OutPutConst;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * <p>构造json对象</p>
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
public class BaiDuConstructParam {
    public static final String OUTPUT = "output";//输出格式
    public static final String APIKEY = "ak";//秘钥
    private static final String CHARSET = "UTF-8";

    /**
     * 参数整理
     * TODO
     *
     * @param map
     * @return
     * @author jiangn
     * @created 2016年2月24日 下午7:41:02
     */
    public static Map<String, String> reorganizeParam(Map<String, String> map) {
        if (!map.containsKey(OUTPUT) || Check.NuNStrStrict(map.get(OUTPUT))) {
            map.put(OUTPUT, OutPutConst.OutPutFormat.JSON.getType());
        }
        if (!map.containsKey(APIKEY) || Check.NuNStrStrict(map.get(APIKEY))) {
            map.put(APIKEY, ConstProperty.BAIDUAPIKEY);
        }
        return map;
    }

    public static String reorganizeUrl(String url, Map<String, String> parameters)
            throws UnsupportedEncodingException {
        if (!Check.NuNMap(parameters)) {
            parameters = BaiDuConstructParam.reorganizeParam(parameters);
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                if (!url.endsWith("?")) {
                    url += "&";
                }
                url += entry.getKey() + "=" + URLEncoder.encode(entry.getValue(), CHARSET);
            }
        }
        return url;
    }
}
