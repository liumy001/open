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
public class ComStateConst {
		//是否有效
		public enum ValidType {
			VALID(1),    //有效
			INVALID(0); //无效
			private int state;
			ValidType(int state) {
	            this.state = state;
	        }
	        /**
	         * 获得状态值
	         *
	         * @return
	         */
	        public int getState() {
	            return this.state;
	        }
		}
		//支付状态
		public enum PaymentType {
			PAYED(1),    //已支付
			NOT_PAYED(0); //未支付

			private int state;

			PaymentType(int state) {
	            this.state = state;
	        }
	        /**
	         * 获得状态值
	         *
	         * @return
	         */
	        public int getState() {
	            return this.state;
	        }

		 }
		//删除状态
		public enum DeleteType {
			DELETED(1),    //删除
			NOT_DELETE(0); //不删除

			private int state;

			DeleteType(int state) {
	            this.state = state;
	        }

	        /**
	         * 获得状态值
	         *
	         * @return
	         */
	        public int getState() {
	            return this.state;
	        }

	    }
		 /**
	     * 推荐状态
	     */
	    public enum SuggestState {
	        Y(1),     //1 推荐
	        N(0);     //0 不推荐

	        private int state;

	        SuggestState(int state) {
	            this.state = state;
	        }

	        /**
	         * 获得状态值
	         *
	         * @return
	         */
	        public int getState() {
	            return this.state;
	        }
	    }
	    //是否显示
        public enum IsShow {
            SHOW(1),    //是
            NOT_SHOW(0); //否
            private int state;
            IsShow(int state) {
                this.state = state;
            }
            /**
             * 获得状态值
             *
             * @return
             */
            public int getState() {
                return this.state;
            }
        }
      //是否自动
        public enum IsAuto {
            AUTO(1),    //是
            NOT_AUTO(0); //否
            private int state;
            IsAuto(int state) {
                this.state = state;
            }
            /**
             * 获得状态值
             *
             * @return
             */
            public int getState() {
                return this.state;
            }
        }
}
