package com.depromeet.warmup.domain.user;

import com.depromeet.warmup.global.entity.DateAuditEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table
@Entity
public class User extends DateAuditEntity {

    @Getter
    @Column(nullable = false)
    private String nickname;

    @Builder
    private User(final String nickname) {
        this.nickname = nickname;
    }
}
