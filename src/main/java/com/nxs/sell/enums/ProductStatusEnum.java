package com.nxs.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 *
 * @author
 * @create 2017-09-11 22:46
 **/
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code ,String message) {
        this.code = code;
        this.message = message;
    }
}
