package com.bluebik.api_gw.model;

import lombok.Data;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;

@Data
public class ApiResponse {
    private String status;
    private Object data;
    private String message;

    public ApiResponse(String status, Object data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public static ApiResponse fail(Object data, String message) {
        return new ApiResponse("FAIL", data, message);
    }
    public static ApiResponse ok(Object data, String message) {
        return new ApiResponse("OK", data, message);
    }
}
