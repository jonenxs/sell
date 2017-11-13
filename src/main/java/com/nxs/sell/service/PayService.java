package com.nxs.sell.service;

import com.nxs.sell.dto.OrderDTO;

/**
 * 支付
 */
public interface PayService {
    void create(OrderDTO orderDTO);
}
