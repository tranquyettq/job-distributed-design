package com.tranquyet.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity {
    @CreatedDate
    private String createdDate;
    @LastModifiedDate
    private String updatedDate;
    @CreatedBy
    private String createdUser;
    @LastModifiedBy
    private String updatedUser;
    @Column(length = 2, columnDefinition = "SMALLINT")
    private Integer status;
    @Column(length = 2, columnDefinition = "SMALLINT")
    private Integer deletedStatus;
}
