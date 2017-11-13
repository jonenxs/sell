package com.nxs.sell.utils;

import java.util.Random;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2017-09-12 0:00
 **/
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间 + 随机数
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();
        Integer a = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(a);
    }
}
