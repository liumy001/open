/**
 * @FileName: BaseConst.java
 * @Package: com.ziroom.sms.commons.constant
 * @author sence
 * @created 7/27/2015 11:55 AM
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
 * @author sence
 * @version 1.0
 * @since 1.0
 */
public abstract class BaseConst {

    /**
     * 私有化构造
     */
    public BaseConst(){

    }
    /**
     * 通用错误消息，返回:服务错误
     */
    public static final String UNKNOWN_ERROR = "unknown.error";

    /**
     * 通用错误消息，返回的error
     */
    public static final String ERROR_CODE = "error";

    /**
     * 通用提示消息，对象不存在
     */
    public static final String NOT_FOUND = "obj.null";

    /**
     * 通用提示消息，对象不存在
     */
    public static final String PARAM_NULL = "param.null";

    /**
     * 查找条件名字
     */
    public static final String SEARCH_CONDITION_NAME = "searchCondition";

    /**
     * 保存失败
     */
    public static final String SAVE_ERROR = "save.error";

    /**
     * 更新失败
     */
    public static final String UPDATE_ERROR = "update.error";
}
