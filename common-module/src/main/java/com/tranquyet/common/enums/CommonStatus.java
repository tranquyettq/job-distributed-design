package com.tranquyet.common.enums;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Getter
@NoArgsConstructor
public enum CommonStatus {
    HEALTH_CHECK("VAL00001", "I am fine");

    CommonStatus(String code, String message){
        this.code = code;
        this.message = message;
    }
    private String code;
    private String message;

    public static CommonStatus getByCode(String code){
        return Arrays.stream(values()).filter(p->p.getCode().equals(code)).findFirst().orElseThrow();
    }

}
