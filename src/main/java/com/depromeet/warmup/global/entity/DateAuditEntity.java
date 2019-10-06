package com.depromeet.warmup.global.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class DateAuditEntity extends AutoPrimaryEntity {

    @Getter
    @CreatedDate
    private LocalDateTime createdDate;

    @Getter
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
