/*
 * Copyright (c) 2015. ziroom.
 */
package com.pub.open.commons.constant;

/**
 * <p>日志数据类型</p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author sunzhenlei
 * @version 1.0
 * @date 2015/9/26 11:38
 * @since 1.0
 */
public class DealLogDataTypeConst {

    private DealLogDataTypeConst() {
    }

    public enum DataTypeEnum {
        // 0,维修项目;1,维修工单;2,保洁工单;3,投诉工单;4,供应商维修项目;5,自如网传递图片;6,供应商保洁工单;7,租务工单;8,咨询工单;
        // 9, 问题升级;10,租务服务项目;11,保洁催单;12自如搬家;13,客户信息;
        WXXM(0),
        WXWORKBILL(1),
        BJGD(2),
        TSGD(3),
        GYSWXXM(4),
        ZIRUPICTURE(5),
        GYSBJBILL(6),
        ZUWU(7),
        ZXBILL(8),
        WTSJ(9),
        ZWFWXM(10),
        BJCD(11),
        ZRBJ(12),
        KHXX(13);

        private int type;

        DataTypeEnum(int type) {
            this.type = type;
        }

        public int getType() {
            return type;
        }
    }

    /**
     * 日志类型枚举
     */
    public enum MoveDealLogTypeEnum {
        // 588:搬家修改备注 589:搬家下单 5891:搬家工单修改 590:搬家工单取消 591:搬家受理 592:搬家派单 593:搬家跟进记录 594:搬家工单退回
        // 595:搬家工单完成 596:搬家支付 5961:搬家支付 跟进记录 597:搬家评价 598:搬家改价 599:搬家权益+1(-1) 5991:搬家受理+1 5992:搬家取消-1
        //600:搬家签到
        BJXGBZ(588),
        BJXD(589),
        BJXDXG(5891),
        BJQX(590),
        BJYSL(591),
        BJYPD(592),
        BJGJJL(593),
        BJTH(594),
        BJWC(595),
        BJZF(596),
        BJZFGJJL(5961),
        BJPJ(597),
        BJGJ(598),
        BJXQ(599),
        SLBJ(5991),
        QXBJ(5992),
        BJQD(600);

        private int status;

        MoveDealLogTypeEnum(int status) {
            this.status = status;
        }

        public int getStatus() {
            return this.status;
        }
    }
}
