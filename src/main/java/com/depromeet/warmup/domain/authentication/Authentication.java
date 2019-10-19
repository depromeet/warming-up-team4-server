package com.depromeet.warmup.domain.authentication;

import com.depromeet.warmup.domain.user.User;
import com.depromeet.warmup.global.entity.AutoPrimaryEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Entity
public class Authentication extends AutoPrimaryEntity {

    @Getter
    @Column(nullable = false)
    private String email;

    @Getter
    @Column(nullable = false)
    private String password;

    @Getter
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "owner", referencedColumnName = "id")
    private User user;

    @Builder
    private Authentication(final String email,
                           final String password,
                           final String nickname) {
        this.email = email;
        this.password = password;

        user = User.builder()
                .nickname(nickname)
                .build();
    }

    public long getUserObjectId() {
        return user.getId();
    }
}
