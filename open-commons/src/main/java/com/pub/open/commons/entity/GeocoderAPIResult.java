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
public class GeocoderAPIResult extends BaseEntity {

    private static final long serialVersionUID = -540801415487347413L;

    private Integer status;

    private GeocoderResult result;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public GeocoderResult getResult() {
        return result;
    }

    public void setResult(GeocoderResult result) {
        this.result = result;
    }
}
