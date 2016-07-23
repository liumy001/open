/**
 * @FileName: DisPatchRuleStateConst.java
 * @Package com.ziroom.sms.commons.constant
 *
 * @author jn
 * @created 2015-9-23 下午5:52:48
 *
 * Copyright 2011-2015 ziroom
 */
package com.pub.open.commons.constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
public class DisPatchRuleStateConst {
		//流程类型
		public enum ProcessType {
			ACCEPT("1"),     //受理
			SEND("2"),       //派单
			DISPATCH("3");   //派工
			private String state;
			ProcessType(String state) {
	            this.state = state;
	        }
	        /**
	         * 获得状态值
	         *
	         * @return
	         */
	        public String getState() {
	            return this.state;
	        }
		}
		//接单类型
		public enum AcceptType{
			ALL("1","全部"),          //全部
			REMARK("2","只接受备注");       //只含备注
			private String state;
			private String name;
			AcceptType(String state,String name) {
	            this.state = state;
	            this.name = name;
	        }
	        /**
	         * 获得状态值
	         *
	         * @return
	         */
	        public String getState() {
	            return this.state;
	        }
	        public String getName() {
				return name;
			}
			public static AcceptType getByState(String state){
	        	for(AcceptType acceptType:AcceptType.values()){
	        		if(acceptType.getState().equals(state)){
	        			return acceptType;
	        		}
	        	}
	        	return null;
	        }
			public static List<HashMap<String, String> > getDateList(){
				List<HashMap<String, String>> list=new ArrayList<HashMap<String,String>>();
	        	for(AcceptType acceptType:AcceptType.values()){
	        		HashMap<String, String> map=new HashMap<String, String>();
	        		map.put(acceptType.getState(), acceptType.getName());
	        		list.add(map);
	        	}
	        	return list;
	        }
		}
}
