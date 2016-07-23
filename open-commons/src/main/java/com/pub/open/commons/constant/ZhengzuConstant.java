package com.pub.open.commons.constant;

import com.asura.framework.base.util.Check;

/**
 * <p>整租视图相关常量</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author wurt
 * @version 1.0
 * @create 2016/5/29
 * @since 1.0
 */
public class ZhengzuConstant {

    /**
     * 合同状态
     */
    public enum ContractStatus {
        YTZ("ytz", "已退租"),
        YDQ("ydq", "已到期"),
        YQY("yqy", "已签约"),
        YZF("yzf", "已作废");

        private String code;

        private String type;

        ContractStatus(String code, String type) {
            this.code = code;
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public String getCode() {
            return code;
        }

        public static ContractStatus getByCode(String code) {
            if (Check.NuNStrStrict(code))
                return null;
            for (ContractStatus contractStatus : ContractStatus.values()) {
                if (contractStatus.getCode().equals(code)) {
                    return contractStatus;
                }
            }
            return null;
        }
    }

    /**
     * 整租合同中的城市编号
     */
    public enum TerritoryCode {
        BJ(11L, "110000"),
        SH(50L, "310000"),
        SZ(24L, "440300");

        /**
         * 视图中的城市编号
         */
        private Long code;

        /**
         * 对应服务的城市编号
         */
        private String cityCode;

        TerritoryCode(Long code, String cityCode) {
            this.code = code;
            this.cityCode = cityCode;
        }

        public Long getCode() {
            return code;
        }

        public String getCityCode() {
            return cityCode;
        }

        public static TerritoryCode getByCode(Long code) {
            if (Check.NuNObj(code))
                return null;
            for (TerritoryCode territoryCode : TerritoryCode.values()) {
                if (territoryCode.getCode().equals(code)) {
                    return territoryCode;
                }
            }
            return null;
        }
    }
}
