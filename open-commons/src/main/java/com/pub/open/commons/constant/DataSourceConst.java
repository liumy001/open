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
 * <p>数据来源</p>
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
public class DataSourceConst {
		//数据来源
		public enum DataSource {
			ZIROOMNET(1,"自如网"),    
			ZIROOMCUSTOM(2,"自如客服"),   
			INFEEDBACK(3,"内部反馈"),  
			BUSISEPCIAL(4,"业务专员"),   
			SATISVISIT(5,"满意度回访"),    
			WEIBO(6,"微博"),    
			LINKCUSTOM(7,"链家客服"),  
			INDIVIDCALL(8,"个人来电"),    
			 SYSGEN(9,"系统生成"),
			IOSAPP(10,"IOS APP"),   
			WEXIN(11,"微信"),    
			ANDROIDAPP(12,"ANDROID APP"); 
			private int key;
			private String value;
			
            public int getKey() {
                return key;
            }

            public String getValue() {
                return value;
            }

            private DataSource(int key, String value) {
                this.key = key;
                this.value = value;
            }
           
			public static DataSource findValue(int key){
			   for( DataSource dataSource: DataSource.values()){
			       if(dataSource.getKey()==key){
			           return dataSource;
			       }
			   }
			   return null; 
			}
						
		}
		
}
