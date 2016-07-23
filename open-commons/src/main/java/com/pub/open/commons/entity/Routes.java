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
 * @date 2016/2/16 11:54
 * @since 1.0
 */
public class Routes implements Serializable{


    private static final long serialVersionUID = 1420997538071628505L;
    /**
     * 搬家距离 (单位：米)
     */
    private Double distance;

    /**
     * 线路耗时 (单位：秒)
     */
    private Double duration;

    /**
     * 过路费
     */
    private Double toll;

    /**
     * 起点经纬度坐标
     */
    private LocationPoint originLocation;

    /**
     * 终点经纬度坐标
     */
    private LocationPoint destinationLocation;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getToll() {
        return toll;
    }

    public void setToll(Double toll) {
        this.toll = toll;
    }

    public LocationPoint getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(LocationPoint originLocation) {
        this.originLocation = originLocation;
    }

    public LocationPoint getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(LocationPoint destinationLocation) {
        this.destinationLocation = destinationLocation;
    }
}
