package com.tranquyet.task.producer.controller;

import com.tranquyet.common.domain.ResponseDomain;
import com.tranquyet.common.enums.CommonStatus;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeApi {

    @GetMapping("/health/check")
    public ResponseEntity<ResponseDomain> healthCheck(){
        ResponseDomain responseDomain = ResponseDomain.builder()
                .errorCode(CommonStatus.HEALTH_CHECK.getCode())
                .message(CommonStatus.HEALTH_CHECK.getMessage()).build();
        return new ResponseEntity<>(responseDomain, HttpStatus.OK);
    }
}
