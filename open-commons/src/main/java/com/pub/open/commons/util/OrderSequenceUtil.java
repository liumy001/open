/**
 * @FileName: OrderSequenceUtil.java
 * @Package: com.ziroom.sms.commons.util
 * @author sence
 * @created 7/10/2015 1:33 PM
 * <p/>
 * Copyright 2015 ziroom
 */
package com.pub.open.commons.util;

import com.asura.framework.base.exception.BusinessException;
import com.asura.framework.base.util.DateUtil;
import com.pub.open.commons.constant.WorkBillTypeConst;

import java.util.Date;

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
public class OrderSequenceUtil {


    private static final String PREFIX_ZRBJ = "ZRBJ";
    private static final String PREFIX_BJ = "BJ";
    private static final String PREFIX_GYS_BJ = "GBJ";
    private static final String PREFIX_GENERAL_CLEAN = "GC";
    private static final String PREFIX_GENERAL_CONSULT = "ZX";

    /**
     * private
     */
    private OrderSequenceUtil() {

    }

    /**
     * 生成保洁工单号
     *
     * @param sequence,type
     * @return
     */
    public static String getOrderNum(String sequence, WorkBillTypeConst type) {
        switch (type) {
            case ZRBJ:
                return genZRBJOrderNum(sequence);
            case BJ:
                return genMonthBjOrderNum(sequence);
            case SUP:
                return genSupBjOrderNum(sequence);
            case GC:
                return generalCleanOrderSequence(sequence);
            case ZX:
                return genConsultOrderNum(sequence);
            default:
                throw new BusinessException("generator order num failed not support order type");
        }
    }

    /**
     * 生成保洁工单号
     *
     * @param sequence
     * @return
     */
    private static String genZRBJOrderNum(String sequence) {
        return genOrderNum(sequence, PREFIX_ZRBJ, "_");
    }

    /**
     * 生成供应商保洁单
     *
     * @param sequence
     * @return
     */
    private static String genMonthBjOrderNum(String sequence) {
        return genOrderNum(sequence, PREFIX_BJ);
    }

    /**
     * 生成供应商保洁单
     *
     * @param sequence
     * @return
     */
    private static String genSupBjOrderNum(String sequence) {
        return genOrderNum(sequence, PREFIX_GYS_BJ);
    }

    /**
     * 生成通用保洁工单号
     *
     * @param nextSequence
     * @return
     */
    private static String generalCleanOrderSequence(String nextSequence) {
        //序列num
        return genOrderNum(nextSequence, PREFIX_GENERAL_CLEAN, "_");
    }

    /**
     * 生成咨询工单号
     *
     * @param sequence
     * @return
     */
    private static String genConsultOrderNum(String sequence) {
        //序列num
        return genOrderNum(sequence, PREFIX_GENERAL_CONSULT);
    }

    /**
     * 生成保洁单号 规则
     * [BJ,WX,ZW,]yyyyMMdd[strs]sequence  XX_MMM_DFGD
     *
     * @param sequence
     * @param prefixStr
     * @return
     */
    private static String genOrderNum(String sequence, String prefixStr, String... strs) {
        String dateStr = DateUtil.dateFormat(new Date(), "yyyyMMdd");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(prefixStr).append(dateStr);
        for (String str : strs) {
            stringBuilder.append(str);
        }
        stringBuilder.append(sequence);
        return stringBuilder.toString();
    }
}
