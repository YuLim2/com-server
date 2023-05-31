package com.kingyu.com.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@Getter
@AllArgsConstructor
public class ErrorResponse {

    private String code;
    private String message;
    private Map<String, String> error;

    public ErrorResponse(ErrorProperty errorProperty, Map<String, String> error) {
        this.code = errorProperty.name();
        this.message = errorProperty.getMessage();
        this.error = error;
    }

    public ErrorResponse(ErrorProperty errorProperty, String message) {
        this.code = errorProperty.name();
        this.message = message;
    }

    public ErrorResponse(ErrorProperty errorProperty) {
        this.code = errorProperty.name();
        this.message = errorProperty.getMessage();
    }

}
