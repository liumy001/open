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
public class ServeTypeConst {
	//保洁服务类型
	public enum CleanType {
	    
		GENERALCEAN("107"); //保洁工单
		
		
        private String type;
        CleanType(String type) {
            this.type = type;
        }
		public String getType() {
			return type;
		}
      

    }

    // 搬家服务类型
    public enum MoveType {
        // 8:自如小搬
        ZRXB("8");


        private String type;

        MoveType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }


    }
    //服务种类 1维修、2保洁、3配置、4租务、5物品、6其他、7配件、8搬家（MOVEHOUSE）、9咨询、107通用保洁
    public enum BusinessType {
        MAINTAIN("1"),
        CLEAN("2"),
        ALLOCATION("3"),
        RENT("4"),
        GOODS("5"),
        OTHERS("6"),
        PARTS("7"),
        MOVE("8"),
        CONSULT("9"),
        GENERALCEAN("107"); 
               
        private String type;

        BusinessType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    
    }
}
