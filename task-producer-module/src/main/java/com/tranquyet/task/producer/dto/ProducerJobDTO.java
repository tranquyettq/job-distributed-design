package com.tranquyet.task.producer.dto;

import com.tranquyet.common.dto.AbstractDTO;
import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@Builder
public class ProducerJobDTO extends AbstractDTO {
    private Long id;
}
