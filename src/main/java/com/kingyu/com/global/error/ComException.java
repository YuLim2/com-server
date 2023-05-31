package com.kingyu.com.global.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ComException extends RuntimeException{
    
    private final ErrorProperty errorProperty;
    
}
