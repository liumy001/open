/**
 * @FileName: SMSIssendEnum.java
 * @Package com.ziroom.sms.commons.constant
 * 
 * @author bushujie
 * @created 2015-11-17 下午8:13:57
 * 
 * Copyright 2011-2015 asura
 */
package com.pub.open.commons.constant;

import com.asura.framework.conf.subscribe.AsuraSub;

/**
 * <p>短信发短信开关</p>
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
public enum SMSIssendEnum {
	
	SMS_IS_SEND_ENUM("sms-commons", "sms-is-send", "true", "短信发短信开关");

	private String type;
    private String code;
    private String defaultValue;
    private String notes;
    
    SMSIssendEnum(String type, String code, String defaultValue, String notes) {
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
   	 * @param type the type to set
   	 */
   	public void setType(String type) {
   		this.type = type;
   	}

   	/**
   	 * @return the code
   	 */
   	public String getCode() {
   		return code;
   	}

   	/**
   	 * @param code the code to set
   	 */
   	public void setCode(String code) {
   		this.code = code;
   	}

   	/**
   	 * @return the defaultValue
   	 */
   	public String getDefaultValue() {
   		return defaultValue;
   	}

   	/**
   	 * @param defaultValue the defaultValue to set
   	 */
   	public void setDefaultValue(String defaultValue) {
   		this.defaultValue = defaultValue;
   	}

   	/**
   	 * @return the notes
   	 */
   	public String getNotes() {
   		return notes;
   	}

   	/**
   	 * @param notes the notes to set
   	 */
   	public void setNotes(String notes) {
   		this.notes = notes;
   	}
}
