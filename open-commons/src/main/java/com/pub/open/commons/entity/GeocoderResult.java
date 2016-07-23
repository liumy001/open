/*
 * Copyright (c) 2016. ziroom.com.
 */
package com.pub.open.commons.entity;

import com.asura.framework.base.entity.BaseEntity;

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
 * @date 2016/2/18 14:51
 * @since 1.0
 */
public class GeocoderResult extends BaseEntity {

    private static final long serialVersionUID = -540801415487347413L;

    private Integer precise;

    private Integer confidence;

    private String level;

    private LocationPoint location;

    public Integer getPrecise() {
        return precise;
    }

    public void setPrecise(Integer precise) {
        this.precise = precise;
    }

    public Integer getConfidence() {
        return confidence;
    }

    public void setConfidence(Integer confidence) {
        this.confidence = confidence;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public LocationPoint getLocation() {
        return location;
    }

    public void setLocation(LocationPoint location) {
        this.location = location;
    }
}
