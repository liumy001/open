package com.pub.open.commons.constant;

import com.asura.framework.base.entity.DataTransferObject;
import com.asura.framework.base.util.MessageSourceUtil;
import org.slf4j.Logger;
import org.springframework.context.MessageSource;

/**
 * <p></p>
 *
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author jiangn18
 * @version 1.0
 * @date 2016/6/2 17:58
 * @since 1.0
 */
public class ProxyUtil {
    /**
     *  错误返回
     * @param logger
     * @param e
     * @param messageSource
     * @return
     */
    public static DataTransferObject returnError(final Logger logger, Exception e, MessageSource messageSource) {
        DataTransferObject dto = new DataTransferObject();
        if (logger.isErrorEnabled()) {
            logger.error("error:{}", e);
        }
        dto.setErrCode(MessageSourceUtil.getIntMessage(messageSource, MessageConst.ERROR_CODE));
        dto.setMsg(MessageSourceUtil.getChinese(messageSource, MessageConst.UNKNOWN_ERROR));
        return dto;
    }
}
