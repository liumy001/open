/**
 * @FileName: WXSMSACCOUNT.java
 * @Package com.ziroom.sms.commons.constant
 * 
 * @author bushujie
 * @created 2015-11-17 下午7:04:09
 * 
 * Copyright 2011-2015 asura
 */
package com.pub.open.commons.constant;

import com.asura.framework.conf.subscribe.AsuraSub;

/**
 * <p>维修发短信账号</p>
 * 
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 * 
 * @author bushujie
 * @since 1.0
 * @version 1.0
 */
@AsuraSub
public enum WXSMSAccountEnum {
	
	WX_SMS_ACCOUNT_ENUM("sms-commons", "sms-wx-account", "ziru_weixiu", "维修发短信账号");

	private String type;
    private String code;
    private String defaultValue;
    private String notes;
    
    WXSMSAccountEnum(String type, String code, String defaultValue, String notes) {
        this.type = type;
        this.code = code;
        this.defaultValue = defaultValue;
        this.notes = notes;
    }
    
    /**
   	 * @return the type
   	 */
   	public String getType() {
   		return type;
   	}

   	/**
   	 * @return the code
   	 */
   	public String getCode() {
   		return code;
   	}


   	/**
   	 * @return the defaultValue
   	 */
   	public String getDefaultValue() {
   		return defaultValue;
   	}


   	/**
   	 * @return the notes
   	 */
   	public String getNotes() {
   		return notes;
   	}


}
