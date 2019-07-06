package com.tangenta.gkassist.common.exception;

import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;


public enum ErrorCode {
    LOCK_OCCUPIED(CONFLICT, "任务已被锁定，请稍后重试"),
    SYSTEM_ERROR(INTERNAL_SERVER_ERROR, "系统错误"),
    SCHOOLID_NONEXIST_ERROR(NOT_FOUND, "找不到学校"),
    REQUEST_VALIDATION_FAILED(BAD_REQUEST, "请求数据格式验证失败");


    private HttpStatus status;
    private String message;

    ErrorCode(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
