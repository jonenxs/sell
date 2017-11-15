package com.nxs.sell.service.impl;

import com.nxs.sell.dto.OrderDTO;
import com.nxs.sell.service.OrderService;
import com.nxs.sell.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceImplTest {
    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;

    @Test
    public void create() throws Exception {
        OrderDTO orderDTO = orderService.findOne("1506091704214683272");
        payService.create(orderDTO);
    }

    @Test
    public void refund() throws Exception {
        OrderDTO orderDTO = orderService.findOne("1506091704214683272");
        payService.refund(orderDTO);
    }

}