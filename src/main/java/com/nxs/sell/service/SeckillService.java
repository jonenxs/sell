package com.nxs.sell.service;

public interface SeckillService {
    String querySecKillProductInfo(String productId);

    void orderProductMockDiffUser(String productId);
}
