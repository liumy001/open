/**
 * @FileName: ComStateConst.java
 * @Package com.ziroom.sms.commons.constant
 *
 * @author jn
 * @created 2015-9-23 下午5:52:48
 *
 * Copyright 2011-2015 ziroom
 */
package com.pub.open.commons.constant;

/**
 * <p>公用状态常量</p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author jn
 * @since 1.0
 * @version 1.0
 */
public class OutPutConst {
    public enum OutPutFormat {
        JSON("json"),
        XML("xml");
               
        private String type;

        OutPutFormat(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    
    }
}
