/**
 * @FileName: AdCodeUtil.java
 * @Package com.ziroom.sms.commons.util
 * @author jiangn
 * @created 2016年2月25日 下午3:47:35
 * <p/>
 * Copyright 2011-2015 asura
 */
package com.pub.open.commons.util;

import com.asura.framework.base.util.Check;
import com.pub.open.commons.constant.CityConst;

/**
 * <p地址Code 校验</p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author jiangn
 * @since 1.0
 * @version 1.0
 */
public class AdCodeUtil {
    /**
     * 针对ziroom网,2个code是否是同一个城市
     * TODO
     *
     * @author jiangn
     * @created 2016年2月25日 下午3:49:08
     *
     * @param sourceAdCode
     * @param desAdCode
     * @return
     */
    public static boolean isZiroomSameCity(String sourceAdCode, String desAdCode) {
        if (!checkValidAdCode(sourceAdCode, desAdCode)) {
            return false;
        }
        //如果都是直辖市，用省比较，否则市比较
        if (!Check.NuNObj(CityConst.Municipality.getByCityCode(desAdCode))) {
            return isSameProvice(sourceAdCode, desAdCode);
        }
        return isSameCity(sourceAdCode, desAdCode);
    }

    /**
     * ziroom网,2个code是否是同一个省
     * TODO
     *
     * @author jiangn
     * @created 2016年2月25日 下午3:49:08
     *
     * @param sourceAdCode
     * @param desAdCode
     * @return
     */
    public static boolean isSameProvice(String sourceAdCode, String desAdCode) {
        if (!checkValidAdCode(sourceAdCode, desAdCode)) {
            return false;
        }
        if (!sourceAdCode.substring(0, 3).equals(desAdCode.substring(0, 3))) {
            return false;
        }
        return true;
    }

    private static boolean checkValidAdCode(String sourceAdCode, String desAdCode) {
        if (Check.NuNStrStrict(sourceAdCode) || Check.NuNStrStrict(desAdCode)) {
            return false;
        }
        if (sourceAdCode.length() != 6 || desAdCode.length() != 6) {
            return false;
        }
        return true;
    }

    /**
     * 2个code是否是同一个市
     * TODO
     *
     * @author jiangn
     * @created 2016年2月25日 下午3:49:08
     *
     * @param sourceAdCode
     * @param desAdCode
     * @return
     */
    public static boolean isSameCity(String sourceAdCode, String desAdCode) {
        if (!checkValidAdCode(sourceAdCode, desAdCode)) {
            return false;
        }
        if (!sourceAdCode.substring(0, 4).equals(desAdCode.substring(0, 4))) {
            return false;
        }
        return true;
    }
}
