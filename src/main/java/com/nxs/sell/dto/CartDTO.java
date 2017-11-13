package com.nxs.sell.dto;

import lombok.Data;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2017-09-14 21:37
 **/
@Data
public class CartDTO {

    /**
     * 产品id。
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
