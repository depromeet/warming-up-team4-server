package com.depromeet.warmup.domain.authentication;

import com.depromeet.warmup.domain.university.University;
import com.depromeet.warmup.domain.user.User;
import com.depromeet.warmup.global.entity.AutoPrimaryEntity;
import com.depromeet.warmup.global.entity.ProtobufConverter;
import com.depromeet.warmup.grpc.entity.AuthenticationOuterClass;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Entity
public class Authentication extends AutoPrimaryEntity
        implements ProtobufConverter<AuthenticationOuterClass.Authentication> {

    private static final String SYMBOL_OF_ADDRESS = "@";
    private static final int POSITION_OF_EMAIL_DOMAIN = 1;

    @Getter
    @Column(nullable = false)
    private String email;

    @Getter
    @Column(nullable = false)
    private String password;

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

    public void encodePassword(final PasswordEncoder passwordEncoder) {
        this.password = passwordEncoder.encode(password);
    }

    public Authentication setUniversity(final University university) {
        user.setUniversity(university);
        return this;
    }

    @Override
    public AuthenticationOuterClass.Authentication toProtoBuf() {
        return AuthenticationOuterClass.Authentication.newBuilder()
                .setEmail(email)
                .setUser(user.toProtoBuf())
                .build();
    }

    public long getUserObjectId() {
        return user.getId();
    }

    public String getNickname() {
        return user.getNickname();
    }

    public String getEmailDomain() {
        return email.split(SYMBOL_OF_ADDRESS)[POSITION_OF_EMAIL_DOMAIN];
    }
}
