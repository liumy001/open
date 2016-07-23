/**
 * @FileName: WorkBillTypeConst.java
 * @Package: com.ziroom.sms.commons.constant
 * @author jn
 * @created 9/10/2015 10:28 AM
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
 * @author jn
 * @version 1.0
 * @since 1.0
 */
public class PayTypeConst {
	
    public enum PayType {
        JDPAY("jd_pay"),
        ZFBPAY("zfb_pay"),
        LYIOSPAY("ly_ios_pay"),
        YLPAY("yl_pay"),
        LYADPAY("ly_ad_pay"),
        YLIOSPAY("yl_ios_pay"),
        WXIOSPAY("wx_ios_pay"),
        WXADPAY("wx_ad_pay"),
        CFTWXPAY("cft_wx_pay"),
        CASHPAY("cash_pay"); 
               
        private String type;

        PayType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    
    }
}
