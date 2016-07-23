package com.pub.open.commons.util;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author wurt
 * @version 1.0
 * @create 2016/5/20 22:13
 * @since 1.0
 */
public class NetUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(NetUtil.class);


    /**
     * 发送JSON请求
     *
     * @param url
     * @param json
     * @return
     * @throws Exception
     */
    public static String postJSON(String url, String json) throws Exception {
        HttpClient client = new HttpClient();
        PostMethod method = new PostMethod(url);

        method.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "utf-8");
        method.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, Integer.valueOf(200000));

        RequestEntity jsonEntity = new StringRequestEntity(json, "application/json", "utf-8");
        method.setRequestEntity(jsonEntity);

        client.executeMethod(method);
        int statusCode = method.getStatusCode();
        LOGGER.trace("statusCode:" + statusCode);
        return method.getResponseBodyAsString();
    }
}
