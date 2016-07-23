/*
 * Copyright (c) 2016. ziroom.com.
 */
package com.pub.open.commons.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.asura.framework.base.entity.DataTransferObject;
import com.asura.framework.base.util.AsuraHttpClient;
import com.asura.framework.base.util.Check;
import com.asura.framework.base.util.SOAResParseUtil;
import com.pub.open.commons.entity.*;

import java.io.UnsupportedEncodingException;
import java.util.Map;


/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author sunzhenlei
 * @version 1.0
 * @date 2016/2/16 15:27
 * @since 1.0
 */
public class BaiDuWebApiUtil {

    private BaiDuWebApiUtil() {
    }


    /**
     * 获取任意两点的路径规划信息
     *
     * @param url        百度API
     * @param parameters 参数
     * @return
     * @throws UnsupportedEncodingException
     */
    public static Routes getDirectionResult(String url, Map<String, String> parameters) throws UnsupportedEncodingException {
        url = BaiDuConstructParam.reorganizeUrl(url, parameters);
        DataTransferObject dto = AsuraHttpClient.getInstance().get(url);
        JSONObject jsonObject = SOAResParseUtil.getJsonObj((String) dto.getData().get("data"));
        if (jsonObject.getIntValue("status") != 0) {
            return null;
        }
        DirectionAPIResult result = JSON.parseObject(jsonObject.toJSONString(), DirectionAPIResult.class);
        if (!Check.NuNObj(result) && result.getStatus() == 0 && !Check.NuNObj(result.getResult()) && !Check.NuNCollection(result.getResult().getRoutes())) {
            return result.getResult().getRoutes().get(0);
        }
        return null;
    }


    public static LocationPoint getGeocodingResult(String url, Map<String, String> parameters) throws UnsupportedEncodingException {
        url = BaiDuConstructParam.reorganizeUrl(url, parameters);
        DataTransferObject dto = AsuraHttpClient.getInstance().get(url);
        JSONObject jsonObject = SOAResParseUtil.getJsonObj((String) dto.getData().get("data"));
        if (jsonObject.getIntValue("status") != 0) {
            return null;
        }
        GeocoderAPIResult geocoderAPIResult = JSON.parseObject(jsonObject.toJSONString(), GeocoderAPIResult.class);
        if (Check.NuNObj(geocoderAPIResult) || geocoderAPIResult.getStatus().intValue() != 0 || Check.NuNObj(geocoderAPIResult.getResult())) {
            return null;
        }
        LocationPoint location = geocoderAPIResult.getResult().getLocation();
        if (Check.NuNObj(location)) {
            return null;
        }
        return location;
    }

    public static AddressResult getAddressResult(String url, Map<String, String> parameters) throws UnsupportedEncodingException {
        url = BaiDuConstructParam.reorganizeUrl(url, parameters);
        DataTransferObject dto = AsuraHttpClient.getInstance().get(url);
        JSONObject jsonObject = SOAResParseUtil.getJsonObj((String) dto.getData().get("data"));
        if (jsonObject.getIntValue("status") != 0) {
            return null;
        }
        BaseAPIResult<AddressResult> baseResult = JSON.parseObject(jsonObject.toJSONString(), new TypeReference<BaseAPIResult<AddressResult>>() {
        });
        if (Check.NuNObj(baseResult) || baseResult.getStatus().intValue() != 0 || Check.NuNObj(baseResult.getResult())) {
            return null;
        }
        return baseResult.getResult();
    }
}
