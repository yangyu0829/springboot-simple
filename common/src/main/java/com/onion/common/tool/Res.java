package com.onion.common.tool;

import lombok.Data;

import java.io.Serializable;

/**
 * 封装结果集
 *
 * @author:yu
 * @date:2019-04-23
 */
@Data
public class Res<T> implements Serializable {

    private static final long serialVersionUID = -2182711875786363804L;

    private int code = 0;
    private T data;
    private String msg;

    public static Res ok = new Res().msg("成功");
    public static Res fail = new Res().code(-1).msg("失败");

    public static Res build() {
        return new Res();
    }

    public static <T> Res build(T data) {
        return new Res().data(data);
    }

    public Res code(int code) {
        this.code = code;
        return this;
    }

    public Res data(T data) {
        this.data = data;
        return this;
    }

    public Res msg(String msg) {
        this.msg = msg;
        return this;
    }
}