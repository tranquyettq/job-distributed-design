package com.tranquyet.common.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class AbstractDTO {
    private String createdDate;
    private String updatedDate;
    private String createdUser;
    private String updatedUser;
    private Integer status;
    private Integer deletedStatus;
}
