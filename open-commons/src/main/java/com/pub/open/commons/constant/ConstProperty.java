
package com.pub.open.commons.constant;

import com.pub.open.commons.util.PropertyUtil;

/**
 * 
 * <p>TODO</p>
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
public class ConstProperty { 

	public static final  String BAIDUAPIKEY = PropertyUtil.getValue("baidu.api.key");
    
    /**
     * 私有构造
     */
    private ConstProperty() {

    }
   
}
