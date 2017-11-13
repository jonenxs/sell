package com.nxs.sell.exception;

import com.nxs.sell.enums.ResultEnum;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2017-09-11 23:27
 **/
public class SellException extends RuntimeException {
    public Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message) {
        super(message);
        this.code = code;
    }
}
