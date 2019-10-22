package com.depromeet.warmup.global.security;

import com.depromeet.warmup.domain.authentication.Authentication;
import com.depromeet.warmup.domain.authentication.AuthenticationRepository;
import com.depromeet.warmup.support.BaseSupports;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

class SecurityUserServiceTest extends BaseSupports {

    private static final String EMAIL = "jaeyeonling@gmail.com";

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationRepository authenticationRepository;

    @BeforeEach
    void setUp() {
        final var authentication = Authentication.builder()
                .email(EMAIL)
                .password(passwordEncoder.encode("password"))
                .nickname("Jaeyeonling")
                .build();

        authenticationRepository.save(authentication);
    }
}