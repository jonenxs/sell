package com.nxs.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.lang.ref.SoftReference;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WeChatAccountConfig {
    /**
     * 公众平台id
     */
    private String mpAppId;

    /**
     * 公众平台秘钥
     */
    private String mpAppSecret;

    /**
     * 开放平台id
     */
    private String openAppId;

    /**
     * 开放平台秘钥
     */
    private String openAppSecret;

    private String mpAppToken;

    private String mpAppEncodingAESKey;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 商户秘钥
     */
    private String mchKey;

    private String keyPath;

    private String notifyUrl;

    /**
     *微信模板id
     */
    private Map<String,String> templateId;
}
