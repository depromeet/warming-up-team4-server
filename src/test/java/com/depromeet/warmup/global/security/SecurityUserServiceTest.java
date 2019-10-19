package com.depromeet.warmup.global.security;

import com.depromeet.warmup.domain.authentication.Authentication;
import com.depromeet.warmup.domain.authentication.AuthenticationRepository;
import com.depromeet.warmup.support.BaseSupports;
import com.depromeet.warmup.utils.random.RandomUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class SecurityUserServiceTest extends BaseSupports {

    private static final String EMAIL = "jaeyeonling@gmail.com";

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationRepository authenticationRepository;

    @Autowired
    private SecurityUserService securityUserService;

    @BeforeEach
    void setUp() {
        final var authentication = Authentication.builder()
                .email(EMAIL)
                .password(passwordEncoder.encode("password"))
                .nickname("Jaeyeonling")
                .build();

        authenticationRepository.save(authentication);
    }

    @Test
    void loadUserByUsername() {
        // when
        final var user = securityUserService.loadUserByUsername(EMAIL);

        // then
        assertThat(user).isNotNull();
    }

    @Test
    void loadUserByUsernameNotFound() {
        assertThatExceptionOfType(NoSuchElementException.class)
                .isThrownBy(() -> securityUserService.loadUserByUsername(RandomUtils.getSecureString(20)));
    }

    @AfterEach
    void tearDown() {
        authenticationRepository.deleteAll();
    }
}