package com.nxs.sell.controller;

import com.nxs.sell.service.SeckillService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skill")
@Slf4j
public class SecKillController {

    @Autowired
    private SeckillService seckillService;

    /**
     * 查询秒杀活动的信息
     * @param productId
     * @return
     * @throws Exception
     */
    @GetMapping("/query/{productId}")
    public String query(@PathVariable String productId)throws Exception {
        return seckillService.querySecKillProductInfo(productId);
    }

    /**
     * 秒杀
     * @param productId
     * @return
     * @throws Exception
     */
    @GetMapping("/order/{productId}")
    public String skill(@PathVariable String productId) throws Exception {
        log.info("@skill request,productId:" + productId);
        seckillService.orderProductMockDiffUser(productId);
        return seckillService.querySecKillProductInfo(productId);
    }
}
