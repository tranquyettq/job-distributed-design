package com.tranquyet.common.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.tranquyet.common.dto.AbstractDTO;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@Builder
public class ResponseDomain extends AbstractDTO {
    private String errorCode;
    private String message;
}
