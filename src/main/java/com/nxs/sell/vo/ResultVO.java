package com.nxs.sell.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 返回给前端的最外层对象
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 6477107715214270405L;
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
