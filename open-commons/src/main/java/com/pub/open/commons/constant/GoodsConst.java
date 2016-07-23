/**
 * @FileName: GoodsConst.java
 * @Package: com.ziroom.sms.services.move.constant
 * @author sence
 * @created 9/21/2015 9:17 PM
 * <p/>
 * Copyright 2015 ziroom
 */
package com.pub.open.commons.constant;

/**
 * <p>商品常量</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author sence
 * @version 1.0
 * @since 1.0
 */
public class GoodsConst {

    private GoodsConst() {

    }

    /**
     * 商品是否商家销售
     */
    public static class GoodsOnSale {
        /**
         * 未上架
         */
        public static final int NOT_ON_SALE = 0;
        /**
         * 商家销售
         */
        public static final int ON_SALE = 1;
    }

    /**
     * 商品类型有效信息设置
     */
    public static class GoodsValid {

        /**
         * 无效
         */
        public static final int INVALID = 0;
        /**
         * 有效
         */
        public static final int VALID = 1;
    }


    /**
     * 商品是否删除
     */
    public static class GoodsIsDel {
        /**
         * 无效
         */
        public static final int ISNODEL = 0;
        /**
         * 有效
         */
        public static final int ISDEL = 1;
    }
}
