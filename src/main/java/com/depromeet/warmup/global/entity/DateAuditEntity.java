package com.depromeet.warmup.global.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class DateAuditEntity extends AutoPrimaryEntity {

    @Getter
    @CreatedDate
    private LocalDateTime createdDate;

    @Getter
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    public long getCreatedDateMillis() {
        return createdDate.toEpochSecond(ZoneOffset.UTC);
    }

    public long getLastModifiedDateMillis() {
        return lastModifiedDate.toEpochSecond(ZoneOffset.UTC);
    }
}
