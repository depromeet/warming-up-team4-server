package com.depromeet.warmup.domain.university;

import com.depromeet.warmup.global.entity.AutoPrimaryEntity;
import com.depromeet.warmup.global.entity.ProtobufConverter;
import com.depromeet.warmup.grpc.entity.UniversityOuterClass;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "emailDomain"))
@Entity
public class University extends AutoPrimaryEntity implements ProtobufConverter<UniversityOuterClass.University> {

    @Getter
    @Column(nullable = false)
    private String name;

    @Getter
    @Column(nullable = false)
    private String emailDomain;

    @Builder
    private University(final String name,
                       final String emailDomain) {
        this.name = name;
        this.emailDomain = emailDomain;
    }

    @Override
    public UniversityOuterClass.University toProtoBuf() {
        return UniversityOuterClass.University.newBuilder()
                .setName(name)
                .setEmailDomain(emailDomain)
                .build();
    }
}
