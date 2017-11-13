package com.nxs.sell.controller;

import com.nxs.sell.dto.OrderDTO;
import com.nxs.sell.enums.ResultEnum;
import com.nxs.sell.exception.SellException;
import com.nxs.sell.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 支付
 */

@Controller
@RequestMapping("/pay")
public class PayController {
    @Autowired
    private OrderService orderService;

    public void create(@RequestParam("orderId") String orderId,
                       @RequestParam("returnUrl") String returnUrl){
        //1.查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if(orderDTO == null){//订单不存在
            throw new SellException(ResultEnum.ORDER_NOT_EXIT);
        }
        //发起支付

    }
}
