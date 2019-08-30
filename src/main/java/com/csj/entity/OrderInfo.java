package com.csj.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.LogicDelete;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Data
@Table(name = "order_info")
public class OrderInfo {
    /**
     * 订单自增id
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)// 返回自动生成的主键值
    @Column(name = "order_id")
    private Integer orderId;

    /**
     * 订单号唯一
     */
    @Column(name = "order_number")
    private String orderNumber;

    /**
     * 是否删除 0 否,1 是
     */
    @LogicDelete
    @Column(name = "is_deleted")
    private Integer isDeleted;

    /**
     * 买家ID
     */
    @Column(name = "buyer_id")
    private Long buyerId;

    /**
     * 订单金额
     */
    @Column(name = "order_amount")
    private BigDecimal orderAmount;

    /**
     * 付款金额
     */
    @Column(name = "pay_amount")
    private BigDecimal payAmount;

    /**
     * 商品最终金额
     */
    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 订单支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 卡的所有者
     */
    @Column(name = "card_owner")
    private String cardOwner;

    /**
     * 卡的编码
     */
    @Column(name = "card_code")
    private String cardCode;

    /**
     * 卡名都
     */
    @Column(name = "card_name")
    private String cardName;

    /**
     * 卡号
     */
    @Column(name = "card_number")
    private String cardNumber;

    /**
     * 交易订单比如支付宝胎我平台的订单号
     */
    @Column(name = "outer_trade_no")
    private String outerTradeNo;

    /**
     * 订单创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 订单附言,由用户提交订单前填写
     */
    private String remark;

    /**
     * 1为平台送,2.卖家自己送
     */
    @Column(name = "delivery_type")
    private Byte deliveryType;

    /**
     * 交易状态訓0为进行中,已完成,2,为取消交易,3,已结算
     */
    @Column(name = "trade_status")
    private Byte tradeStatus;

    /**
     * 支付状态:末付款:2已付款,3,线下付款,4线下付款已收款
     */
    @Column(name = "pay_Status")
    private Byte payStatus;

    /**
     * 订单修时间
     */
    @Column(name = "modified_time")
    private Date modifiedTime;
}