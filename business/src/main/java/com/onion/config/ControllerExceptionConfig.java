package com.onion.config;

import com.onion.common.exception.BusinessException;
import com.onion.common.tool.Res;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author:yu
 * @date:2019-04-23
 */
@RestControllerAdvice
public class ControllerExceptionConfig {

    @ExceptionHandler(value = BusinessException.class)
    public Res<String> businessExceptionHandler(BusinessException e) {
        return Res.build().code(e.getCode()).msg(e.getMsg()).data(e.getMsg());
    }

    @ExceptionHandler(value = Exception.class)
    public Res<String> exceptionHandler( Exception e){
        return Res.build().code(500).msg(e.getMessage()).data(e.getMessage());
    }
}
