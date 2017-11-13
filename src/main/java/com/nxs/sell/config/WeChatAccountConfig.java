package com.nxs.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.lang.ref.SoftReference;

@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WeChatAccountConfig {
    private String mpAppId;

    private String mpAppSecret;

    private String mpAppToken;

    private String mpAppEncodingAESKey;

    private String mchId;

    private String mchKey;

    private String keyPath;

    private String notifyUrl;
}
