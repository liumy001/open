package com.pub.open.commons.util; /**
 * @FileName: DateJudgeUtill.java
 * @Package org.hpin.webservice.utils
 * @author bushujie
 * @created 2016-1-25 下午3:46:25
 * <p/>
 * Copyright 2011-2015 asura
 */

import com.asura.framework.base.entity.DataTransferObject;
import com.asura.framework.base.util.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.Date;

/**
 * <p>时间判断工具类</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author zhaoxg
 * @version 1.0
 * @since 1.0
 */
public class DateJudgeUtil {

    public static final String FORMAT = "yyyy-MM-dd";

    public static final Logger LOGGER = LoggerFactory.getLogger(DateJudgeUtil.class);

    /**
     * 判断是否在时间区间
     *
     * @param orderDateStr
     * @return
     * @throws ParseException
     * @author zhaoxg
     * @created 2016-1-25 下午5:08:16
     */
    public static DataTransferObject isOrder(String orderDateStr) {

        Date orderDate = null;
        Date startDate = null;
        Date endDate = null;
        DataTransferObject dto = null;
        String msg = "春节期间（2月5日--2月15日）该服务暂停，请重新选择时间";
        try {
            orderDate = DateUtil.parseDate(orderDateStr, FORMAT);
            startDate = DateUtil.parseDate("2016-02-04", FORMAT);
            endDate = DateUtil.parseDate("2016-02-16", FORMAT);
        } catch (Exception e) {
            if (LOGGER.isErrorEnabled()) {
                LOGGER.error("ERROR:", e);
            }
            dto = new DataTransferObject();
            dto.setErrCode(DataTransferObject.ERROR);
            dto.setMsg("时间字符串转换异常");
            return dto;
        }

        if (orderDate.after(startDate) && orderDate.before(endDate)) {
            dto = new DataTransferObject();
            dto.setErrCode(DataTransferObject.ERROR);
            dto.setMsg(msg);
            return dto;
        }
        return null;
    }

}
