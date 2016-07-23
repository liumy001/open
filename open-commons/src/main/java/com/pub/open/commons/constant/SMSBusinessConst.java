/**
 * @FileName: SMSBusinessConst.java
 * @Package: com.ziroom.sms.commons.constant
 * @author sence
 * @created 12/2/2015 1:44 PM
 * <p/>
 * Copyright 2015 ziroom
 */
package com.pub.open.commons.constant;

/**
 * <p></p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author sence
 * @since 1.0
 * @version 1.0
 */
public class SMSBusinessConst {

    private SMSBusinessConst(){

    }

    /**
     * 保洁评价
     */
    public static final String CLEANING = "clean";

    /**
     * 保洁评价 涉及到上行，分开
     */
    public static final String CLEANING_EVALUATE = "clean_evaluate";
    /**
     * 通用保洁
     */
    public static final String GC_CLEAN = "general_clean";
    /**
     * 通用保洁评价
     */
    public static final String GC_CLEAN_EVALUATE = "general_clean_evaluate";
    /**
     * 搬家业务
     */
    public static final String MOVE_HOUSE = "move";
    /**
     * 搬家评价
     */
    public static final String MOVE_HOUSE_EVALUATE = "move_evaluate";
    /**
     * 搬家订单取消
     */
    public static final String MOVE_HOUSE_ORDER_CANCEL = "move_house_order_cancel";
    /**
     * 搬家订单受理
     */
    public static final String MOVE_HOUSE_ORDER_ACCEPT = "move_house_order_accept";
    /**
     * 搬家订单派单
     */
    public static final String MOVE_HOUSE_ORDER_DISPATCH = "move_house_order_dispatch";
    /**
     * 搬家订单退回
     */
    public static final String MOVE_HOUSE_ORDER_BACK = "move_house_order_back";
    /**
     * 搬家订单支付
     */
    public static final String MOVE_HOUSE_ORDER_PAY = "move_house_order_pay";
    /**
     * 咨询
     */
    public static final String CONSULT = "consult";
    /**
     * 咨询评价业务
     */
    public static final String CONSULT_EVALUATE = "consult_evaluate";
    /**
     * 维修业务
     */
    public static final String MAINTENANCE = "maintenance";
    /**
     * 维修评价
     */
    public static final String MAINTENANCE_EVALUATE = "maintenance_evaluate";
    /**
     * 租务
     */
    public static final String RENT = "rent";
    /**
     * 租务评价
     */
    public static final String RENT_EVALUATE = "rent_evaluate";
    /**
     * 投诉
     */
    public static final String COMPLAIN = "complain";
    /**
     * 投诉评价
     */
    public static final String COMPLAIN_EVALUATE = "complain_evaluate";

    /**
     * 咨询商机转派
     */
    public static final String CONSULT_SJZP = "consult_sjzp";
    /**
     * 通用保洁取消工单
     */
    public static final String  GC_CLEAN_ORDER_CANCEL= "general_order_cancel";

    /**
     * 基础业务
     */
    public static final String BASE_COMMON = "base";
    /**
     * 优惠券
     */
    public static final String BASE_COMMON_PROMOTION = "base_promotion";

    /**
     * 通用保洁 完成短信提醒
     */
    public static final String GC_CLEAN_COMPLETED_NOTITY = "gener_cl_com_notity";
    /**
     * 改约提醒短信
     */
    public static final String GC_CLEAN_CHANGE_SERVICE = "gener_cl_change_ser";

    /**
     * 整租送保洁短信提醒
     */
    public static final String ZHENGZU_BAOJIE_PROMOTION = "zhengzu_promotion";
}
