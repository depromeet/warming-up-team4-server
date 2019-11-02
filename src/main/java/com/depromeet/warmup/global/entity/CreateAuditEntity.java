package com.depromeet.warmup.global.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class CreateAuditEntity extends AutoPrimaryEntity {

    @Getter
    @CreatedDate
    private LocalDateTime createdDate;

    public long getCreatedDateMillis() {
        return createdDate.toEpochSecond(ZoneOffset.UTC);
    }
}

