package com.onion.common.exception;

import lombok.Data;

/**
 * 自定义基础异常类
 *
 * @author:yu
 * @date:2019-04-23
 */
@Data
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -1121541829177620217L;
    int code;
    String msg;

    public BusinessException(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }
    //throw new BaseException(500,"出错了");
}
