package com.shop4j.cloud.common.exception;

import com.shop4j.cloud.common.response.ResponseEnum;

import java.io.Serial;

/**
 * @author ksying
 * @date 2023/3/12 14:56
 */
public class Shop4CloudException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    private Object object;

    private ResponseEnum responseEnum;

    public Shop4CloudException(String msg) {
        super(msg);
    }

    public Shop4CloudException(String msg, Object object) {
        super(msg);
        this.object = object;
    }

    public Shop4CloudException(String msg, Throwable cause) {
        super(msg, cause);
    }


    public Shop4CloudException(ResponseEnum responseEnum) {
        super(responseEnum.getMsg());
        this.responseEnum = responseEnum;
    }

    public Shop4CloudException(ResponseEnum responseEnum, Object object) {
        super(responseEnum.getMsg());
        this.responseEnum = responseEnum;
        this.object = object;
    }


    public Object getObject() {
        return object;
    }

    public ResponseEnum getResponseEnum() {
        return responseEnum;
    }
}
