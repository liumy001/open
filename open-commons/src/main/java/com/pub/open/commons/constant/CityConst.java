/*
 * Copyright (c) 2015. ziroom.
 */
package com.pub.open.commons.constant;

import com.asura.framework.base.util.Check;

/**
 * <p>城市相关常量</p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author sunzhenlei
 * @version 1.0
 * @date 2015/9/27 21:41
 * @since 1.0
 */
public class CityConst {

    private CityConst() {
    }
    /**
     * 全国城市编码
     */
    public static final String CITY_QG = "QG";

    /**
     * 北京城市编码
     */
    public static final String CITY_BJ_CODE = "110000";

    /**
     * 上海城市编码 
     */
    public static final String CITY_SH_CODE = "310000";

    /**
     * 深圳城市编码
     */
    public static final String CITY_SZ_CODE = "440300";


    //直辖市
    public enum Municipality {
        CITY_BJ_CODE("110000"),
        CITY_SH_CODE("310000"),
        CITY_TJ_CODE("120000"),
        CITY_CQ_CODE("500000");
        private String cityCode;
        Municipality(String cityCode){
            this.cityCode=cityCode;
        }
        public String getCityCode() {
            return cityCode;
        }
        public static Municipality getByCityCode(String cityCode){
            if(Check.NuNStrStrict(cityCode)){
                return null;
            }
            for(Municipality municipality:Municipality.values()){
                if(municipality.getCityCode().equals(cityCode)){
                    return municipality;
                }
             }
            return null;
         }
    }
}
