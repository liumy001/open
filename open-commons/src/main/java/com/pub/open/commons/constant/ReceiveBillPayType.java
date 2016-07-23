package com.pub.open.commons.constant;

import com.asura.framework.base.util.Check;

/**
 * <p>通用收款单支付类型</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author wurt
 * @version 1.0
 * @create 2016/5/9 18:23
 * @since 1.0
 */
public enum ReceiveBillPayType {

    YL_IOS_PAY("yl_ios_pay", 16),
    YL_AD_PAY("yl_ad_pay", 16),
    WX_IOS_PAY("wx_ios_pay", 17),
    WX_AD_PAY("wx_ad_pay", 17),
    CFT_WX_PAY("cft_wx_pay", 17),
    YBS_WX_PAY("ybs_wx_pay", 17),
    ZFB_PAY("zfb_pay", 8),
    YL_PAY("yl_pay", 9),
    JD_PAY("jd_pay", 19),
    JD_M_PAY("jd_m_pay", 21);

    /**
     * 支付平台返回的payChannel值
     */
    private String payChannel;

    /**
     * 通用收款单对应的支付类型
     */
    private Integer code;

    public String getPayChannel() {
        return payChannel;
    }

    public Integer getCode() {
        return code;
    }

    ReceiveBillPayType(String payChannel, Integer code) {
        this.payChannel = payChannel;
        this.code = code;
    }

    public static Integer getCodeByPayChannel(String payChannel) {
        if (Check.NuNStrStrict(payChannel))
            return null;
        for (ReceiveBillPayType receiveBillPayType : ReceiveBillPayType.values()) {
            if (payChannel.equals(receiveBillPayType.getPayChannel())) {
                return receiveBillPayType.getCode();
            }
        }
        return null;
    }
}
