package com.nxs.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *卖家信息
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String id;

    private String username;

    private String password;

    private String openid;
}
