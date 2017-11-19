package com.nxs.sell.service.impl;

import com.nxs.sell.dataobject.SellerInfo;
import com.nxs.sell.repository.SellerInfoRepository;
import com.nxs.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
