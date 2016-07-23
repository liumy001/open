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
 * @date 2016/2/16 14:16
 * @since 1.0
 */
public class DirectionAPIResult extends BaseEntity {

    private static final long serialVersionUID = 6609565679186598220L;

    private Integer status;

    private String message;

    private Integer type;

    private DirectionResult result;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public DirectionResult getResult() {
        return result;
    }

    public void setResult(DirectionResult result) {
        this.result = result;
    }
}
