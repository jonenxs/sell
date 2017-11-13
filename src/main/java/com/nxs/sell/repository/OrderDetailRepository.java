package com.nxs.sell.repository;

import com.nxs.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2017-09-11 23:00
 **/
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String openid);
}
