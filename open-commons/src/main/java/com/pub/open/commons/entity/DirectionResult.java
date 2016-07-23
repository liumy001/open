/*
 * Copyright (c) 2016. ziroom.com.
 */
package com.pub.open.commons.entity;

import java.io.Serializable;
import java.util.List;

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
 * @date 2016/2/16 14:25
 * @since 1.0
 */
public class DirectionResult implements Serializable {

    private static final long serialVersionUID = 107762662736087505L;
    /**
     * 路径规划信息
     */
    private List<Routes> routes;

    /**
     * 路况评价	0：无路况；1：畅通；2：缓行；3：拥堵
     */
    private Integer traffic_condition;

    public List<Routes> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Routes> routes) {
        this.routes = routes;
    }

    public Integer getTraffic_condition() {
        return traffic_condition;
    }

    public void setTraffic_condition(Integer traffic_condition) {
        this.traffic_condition = traffic_condition;
    }
}
