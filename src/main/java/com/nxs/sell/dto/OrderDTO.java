package com.nxs.sell.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nxs.sell.dataobject.OrderDetail;
import com.nxs.sell.enums.OrderStatusEnum;
import com.nxs.sell.enums.PayStatusEnum;
import com.nxs.sell.utils.EnumUtil;
import com.nxs.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2017-09-11 23:39
 **/
@Data
/**
 * 将该标记放在属性上，如果该属性为NULL则不参与序列化
 * 如果放在类上边,那对这个类的全部属性起作用
 * 同时可以在yml配置文件里面进行配置
 * Include.Include.ALWAYS 默认
 * Include.NON_DEFAULT 属性为默认值不序列化
 * Include.NON_EMPTY 属性为 空（“”） 或者为 NULL 都不序列化
 * Include.NON_NULL 属性为NULL 不序列化
 */
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    private String orderId;

    /**
     *买家名字
     */
    private String buyerName;

    /**
     *买家电话
     */
    private String buyerPhone;

    /**
     * 买家地址
     */
    private String buyerAddress;

    /**
     * 买家微信openid
     */
    private String buyerOpenid;

    /**
     * 订单总金额
     */
    private BigDecimal orderAmount;

    /**
     * 订单状态, 默认0为新下单
     */
    private Integer orderStatus;

    /**
     * 支付状态, 默认0为未支付
     */
    private Integer payStatus;

    /**
     * 创建时间
     */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /**
     * 修改时间
     */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    /**
     * 订单详情
     */
    private List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum(){
        return EnumUtil.getByCode(orderStatus, OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum(){
        return EnumUtil.getByCode(payStatus, PayStatusEnum.class);
    }
}
