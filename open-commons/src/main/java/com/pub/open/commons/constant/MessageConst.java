/**
 * @FileName: MessageConst.java
 * @Package: com.ziroom.sms.services.cleaning.constant
 * @author sence
 * @created 7/27/2015 11:53 AM
 * <p/>
 * Copyright 2015 ziroom
 */
package com.pub.open.commons.constant;

/**
 * <p></p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author sence
 * @version 1.0
 * @since 1.0
 */
public class MessageConst extends BaseConst {

    /**
     * 找不到工单
     */
    public static final String WORKBILL_NOT_FOUND = "workbill.null";
    /**
     * 找不到工单状态
     */
    public static final String STATE_NOT_FOUND = "state.null";
    /**
     * 供应商不存在
     */
    public static final String PROVIDER_NOT_FOUND = "provider.null";
    /**
     * 供应商不存在
     */
    public static final String OPERATOR_NOT_FOUND = "operator.null";
    /**
     * 城市不存在
     */
    public static final String CITY_NOT_FOUND = "city.null";
    /**
     * 城市不匹配
     */
    public static final String CITY_NOT_MATCH = "city.not.match";
    /**
     * 优惠券
     */
    public static final String PROMOCODE_NOT_MATCH = "promocode.not.match";
    /**
     * 工单已派单
     */
    public static final String WORKBILL_SENDED = "cleaning.cleaingflowservice.proxy.sended";
    /**
     * 不支持的服务类型
     */
    public static final String NOT_SUPPORT_SERVICE = "cleaning.not.support.service";
    /**
     * 不支持的服务类型
     */
    public static final String NOT_SUPPORT_XM = "cleaning.not.support.xm";
    /**
     * 私有化其构造
     */
    private MessageConst() {
    }

}
