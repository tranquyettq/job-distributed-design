package com.tranquyet.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractDTO {
    private String createdDate;
    private String updatedDate;
    private String createdUser;
    private String updatedUser;
    private Integer status;
    private Integer deletedStatus;
}
