/*
 * Copyright (c) 2016. ziroom.com.
 */
package com.pub.open.commons.entity;

import java.io.Serializable;

/**
 * <p></p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author sunzhenlei
 * @version 1.0
 * @date 2016/2/16 11:51
 * @since 1.0
 */
public class LocationPoint implements Serializable {


    private static final long serialVersionUID = 4593730657598124667L;
    /**
     * 位置纬度
     */
    private Double lat;

    /**
     * 位置经度
     */
    private Double lng;

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }
}
