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
public class AddressResult {
    private String formatted_address;// 结构化地址信息
    private String  business;// 所在商圈信息，如 "人民大学,中关村,苏州街"
    private AddressComponent addressComponent;//地址组件
    private LocationPoint locationPoint;//经纬度，坐标点
    public String getFormatted_address() {
        return formatted_address;
    }
    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }
    public String getBusiness() {
        return business;
    }
    public void setBusiness(String business) {
        this.business = business;
    }
    public AddressComponent getAddressComponent() {
        return addressComponent;
    }
    public void setAddressComponent(AddressComponent addressComponent) {
        this.addressComponent = addressComponent;
    }
    public LocationPoint getLocationPoint() {
        return locationPoint;
    }
    public void setLocationPoint(LocationPoint locationPoint) {
        this.locationPoint = locationPoint;
    }
}
