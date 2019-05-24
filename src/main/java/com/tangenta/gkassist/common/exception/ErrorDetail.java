package com.tangenta.gkassist.common.exception;

import org.springframework.http.HttpStatus;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

import static java.time.Instant.now;
import static java.util.Collections.unmodifiableMap;

public final class ErrorDetail {
    private final ErrorCode code;
    private final int status;
    private final String message;
    private final String path;
    private final Instant timestamp;
    private final Map<String, Object> data = new HashMap<>();

    private ErrorDetail(AppException ex, String path) {
        this.code = ex.getCode();
        this.status = ex.httpStatus().value();
        this.message = ex.userMessage();
        this.path = path;
        this.timestamp = now();
        if (nonEmpty(ex.getData())) {
            this.data.putAll(ex.getData());
        }
    }

    public ErrorDetail(ErrorCode code, int status, String message, String path, Map<String, Object> data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.path = path;
        this.timestamp = now();
        if (nonEmpty(data)) {
            this.data.putAll(data);
        }
    }

    private static<K, V> boolean nonEmpty(Map<K, V> map) {
        return map != null && !map.isEmpty();
    }

    public static ErrorDetail from(AppException ex, String path) {
        return new ErrorDetail(ex, path);
    }

    public ErrorCode getCode() {
        return code;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public Map<String, Object> getData() {
        return unmodifiableMap(data);
    }

    public HttpStatus httpStatus() {
        return code.getStatus();
    }

}
