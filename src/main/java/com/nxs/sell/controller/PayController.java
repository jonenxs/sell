package com.nxs.sell.controller;

import com.lly835.bestpay.model.PayResponse;
import com.nxs.sell.dto.OrderDTO;
import com.nxs.sell.enums.ResultEnum;
import com.nxs.sell.exception.SellException;
import com.nxs.sell.service.OrderService;
import com.nxs.sell.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 支付
 */

@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayService payService;

    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId") String orderId,
                               @RequestParam("returnUrl") String returnUrl,
                               Map<String,Object> map){
        //1.查询订单
        OrderDTO orderDTO = orderService.findOne(orderId);
        if(orderDTO == null){//订单不存在
            throw new SellException(ResultEnum.ORDER_NOT_EXIT);
        }
        //发起支付
        PayResponse payResponse = payService.create(orderDTO);

        map.put("payResponse",payResponse);

        map.put("returnUrl",returnUrl);

        return new ModelAndView("pay/create",map);
    }

    @PostMapping("/notify")
    public ModelAndView notify(@RequestBody String notifyData){
        payService.notify(notifyData);

        //返回给微信处理结果
        return new ModelAndView("pay/success");
    }
}
