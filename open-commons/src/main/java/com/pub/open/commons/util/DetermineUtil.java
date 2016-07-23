/**
 * @FileName: DetermineUtil.java
 * @Package: com.ziroom.sms.commons.util
 * @author liusq23
 * @created 5/18/2016 11:43 AM
 * <p/>
 * Copyright 2015 ziroom
 */
package com.pub.open.commons.util;

/**
 * <p>判断辅助工具类</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author liusq23
 * @version 1.0
 * @since 1.0
 */
public class DetermineUtil {

    private DetermineUtil() {

    }

    /**
     * 判断数字是否存在在一组数据内
     *
     * @param ints
     * @return
     */
    public static boolean determineIn(int target, int... ints) {
        for (int i : ints) {
            if (target == i) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断字符串是否存在在一组字符串内
     *
     * @param strs
     * @return
     */
    public static boolean determineIn(String target, String... strs) {
        if (target == null) return false;
        if (strs == null) return false;
        for (String str : strs) {
            if (target.equals(str)) {
                return true;
            }
        }
        return false;
    }
}
