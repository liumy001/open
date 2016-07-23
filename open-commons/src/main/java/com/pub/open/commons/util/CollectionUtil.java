package com.pub.open.commons.util;

import java.util.List;


/**
 * <p>集合工具</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author 吕兴志
 * @version 1.0
 * @since 1.0
 */
public class CollectionUtil {

    private CollectionUtil() {

    }

    /**
     * 随机获取一个集合元素
     *
     * @param list
     * @return
     */
    public static <T> T randomDom(List<T> list) {
        if (list != null && list.size() > 0) {
            int index = (int) (Math.random() * list.size());
            return list.get(index);
        } else {
            return null;
        }
    }

}
