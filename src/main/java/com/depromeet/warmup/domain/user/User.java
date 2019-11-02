package com.depromeet.warmup.domain.user;

import com.depromeet.warmup.domain.university.University;
import com.depromeet.warmup.global.entity.DateAuditEntity;
import com.depromeet.warmup.global.entity.ProtobufConverter;
import com.depromeet.warmup.grpc.entity.UserOuterClass;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table
@Entity
public class User extends DateAuditEntity implements ProtobufConverter<UserOuterClass.User> {

    @Getter
    @Column(nullable = false)
    private String nickname;

    @ManyToOne
    @JoinColumn
    private University university;

    @Builder
    private User(final String nickname) {
        this.nickname = nickname;
    }

    public void setUniversity(final University university) {
        this.university = university;
    }

    @Override
    public UserOuterClass.User toProtoBuf() {
        return UserOuterClass.User.newBuilder()
                .setNickname(nickname)
                .setUniversity(university.toProtoBuf())
                .setCreatedDate(getCreatedDateMillis())
                .setLastModifiedDate(getLastModifiedDateMillis())
                .build();
    }
}
