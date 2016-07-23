package com.pub.open.commons.constant;

public class OrderConstant {


    // 订单编号类型
    public enum OrderSnType {

        ZRJX("ZRJX", "维修-客户订单"),
        ZRJX_P("ZRJX_P", "维修-服务商订单"),
        ZRJX_S("ZRJX_S", "维修-服务者订单"),
        MOVE("B", "搬家"),
        CLEAN("C", "保洁");

        private String seqCode;
        private String type;

        OrderSnType(String seqCode, String type) {
            this.type = type;
            this.seqCode = seqCode;
        }

        public String getType() {
            return this.type;
        }

        public String getSeqCode() {
            return seqCode;
        }

        public static OrderSnType get(String seqCode) {
            if (seqCode == null) return null;
            for (OrderSnType type : OrderSnType.values()) {
                if (seqCode.equals(type.getSeqCode())) return type;
            }
            return null;
        }
    }
}
