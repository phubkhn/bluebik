package com.bluebik.api_gw.exception;

import com.bluebik.api_gw.model.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BluebikException.class)
    @ResponseBody
    public ApiResponse handleUserServiceException(BluebikException ex) {
        return ApiResponse.fail(null, ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiResponse handleException(Exception ex) {
        return ApiResponse.fail(null, ex.getMessage());
    }
}
