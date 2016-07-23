package com.pub.open.commons.constant;

/**
 * <p>地址库相关常量</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author wurt
 * @version 1.0
 * @create 2016/5/26 11:09
 * @since 1.0
 */
public class CommonAddressConst {

    /**
     * 数据来源
     */
    public enum DataSource {
        CUSTOMER(1, "客户"),
        SYSTEM(2, "系统");

        DataSource(Integer code, String type) {
            this.code = code;
            this.type = type;
        }

        private Integer code;

        private String type;

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public static DataSource get(Integer code) {
            if (code == null) return null;
            for (DataSource signType : DataSource.values()) {
                if (code.equals(signType.getCode())) return signType;
            }
            return null;
        }
    }
}
