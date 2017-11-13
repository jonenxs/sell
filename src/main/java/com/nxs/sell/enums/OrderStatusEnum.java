package com.nxs.sell.enums;

import lombok.Getter;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2017-09-11 22:41
 **/
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消")
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
