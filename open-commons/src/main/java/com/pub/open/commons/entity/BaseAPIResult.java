/**
 * @FileName: AddressComponent.java
 * @Package com.ziroom.sms.commons.entity
 * 
 * @author jiangn
 * @created 2016年2月24日 下午8:17:57
 * 
 * Copyright 2011-2015 asura
 */
package com.pub.open.commons.entity;

/**
 * <p>地址组件</p>
 * 
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 * 
 * @author jiangn
 * @since 1.0
 * @version 1.0
 */
public class BaseAPIResult<T> {
    private Integer status;//返回状态
    private T result;
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public T getResult() {
        return result;
    }
    public void setResult(T result) {
        this.result = result;
    }
    
}
