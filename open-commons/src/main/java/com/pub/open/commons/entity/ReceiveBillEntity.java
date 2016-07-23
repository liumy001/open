package com.pub.open.commons.entity;

import java.io.Serializable;

/**
 * <p>通用收款单实体类</p>
 * <p>用于调用财务系统的通用收款单接口</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author wurt
 * @version 1.0
 * @create 2016/5/3 16:55
 * @since 1.0
 */
public class ReceiveBillEntity implements Serializable {

    private static final long serialVersionUID = 7727672885361153279L;

    /**
     * 应收金额（分）
     */
    private Long receivableAmount;

    /**
     * 实收金额（分）
     */
    private Long realAmount;

    /**
     * 收款状态
     * 1：未确认 2：已支付 3：付款异常
     */
    private Integer receiptStatus;

    /**
     * 收款类型
     * 维修，租房，搬家，保洁
     */
    private String receiptType;

    /**
     * 收款途径
     * 移动，线上
     */
    private String receiptPath;

    /**
     * 收款类型 1.普通 2.优惠券
     */
    private Integer type = 1;

    /**
     * 支付平台单号或优惠券ID
     */
    private String payNum;

    /**
     * 收款方式
     */
    private Integer receiptMethod;

    /**
     * 付款人
     */
    private String drawee;

    /**
     * 付款账号
     */
    private String payAccount;

    /**
     * 付款银行
     */
    private String payBank;

    /**
     * 是否关联合同
     * 是1，否0 如果关联合同，则合同号必填
     */
    private Integer isContract;

    /**
     * 合同号
     */
    private String contract;

    /**
     * 业务系统关联号
     */
    private String businessNum;

    /**
     * 业务来源
     */
    private String dataSources;

    /**
     * 备注
     */
    private String remark;

    /**
     * 唯一字符串，用于去重
     */
    private String uniqueSequence;

    /**
     * 支付时间
     */
    private String payTime;

    /**
     * 城市编码
     */
    private String cityCode;

    public Long getReceivableAmount() {
        return receivableAmount;
    }

    public void setReceivableAmount(Long receivableAmount) {
        this.receivableAmount = receivableAmount;
    }

    public Long getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Long realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getReceiptStatus() {
        return receiptStatus;
    }

    public void setReceiptStatus(Integer receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public String getReceiptPath() {
        return receiptPath;
    }

    public void setReceiptPath(String receiptPath) {
        this.receiptPath = receiptPath;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getPayNum() {
        return payNum;
    }

    public void setPayNum(String payNum) {
        this.payNum = payNum;
    }

    public Integer getReceiptMethod() {
        return receiptMethod;
    }

    public void setReceiptMethod(Integer receiptMethod) {
        this.receiptMethod = receiptMethod;
    }

    public String getDrawee() {
        return drawee;
    }

    public void setDrawee(String drawee) {
        this.drawee = drawee;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public String getPayBank() {
        return payBank;
    }

    public void setPayBank(String payBank) {
        this.payBank = payBank;
    }

    public Integer getIsContract() {
        return isContract;
    }

    public void setIsContract(Integer isContract) {
        this.isContract = isContract;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getBusinessNum() {
        return businessNum;
    }

    public void setBusinessNum(String businessNum) {
        this.businessNum = businessNum;
    }

    public String getDataSources() {
        return dataSources;
    }

    public void setDataSources(String dataSources) {
        this.dataSources = dataSources;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUniqueSequence() {
        return uniqueSequence;
    }

    public void setUniqueSequence(String uniqueSequence) {
        this.uniqueSequence = uniqueSequence;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}
