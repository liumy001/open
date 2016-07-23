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
public class VisitTypeConst {
	//访问类型
	public enum VisitorType {
	    COMMON(1),  //正常后台，管理员，业务专员
	    PROVIDER(2); //供应商
		
	    private int type;
	    VisitorType(int type) {
            this.type = type;
        }
        public int getType() {
            return type;
        }
      

    }

}
