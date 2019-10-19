package com.depromeet.warmup.global.security;

import com.depromeet.warmup.support.BaseSupports;
import com.depromeet.warmup.utils.random.RandomUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.assertj.core.api.Assertions.assertThat;

class PasswordEncoderTest extends BaseSupports {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void encode() {
        // given
        final var rawPassword = RandomUtils.getSecureString(20);

        // when
        final var encodePassword = encode(rawPassword);

        // then
        assertThat(encodePassword).isNotBlank();
    }

    @Test
    void matches() {
        // given
        final var rawPassword = RandomUtils.getSecureString(20);
        final var encodePassword = encode(rawPassword);

        // when
        final var isMatch = passwordEncoder.matches(rawPassword, encodePassword);

        // than
        assertThat(isMatch).isTrue();
    }

    @Test
    void notMatch() {
        // given
        final var rawPassword = RandomUtils.getSecureString(20);
        final var encodePassword = encode(rawPassword);

        // when
        final var isMatch = passwordEncoder.matches(encodePassword, rawPassword);

        // than
        assertThat(isMatch).isFalse();
    }

    private String encode(final String rawPassword) {
        return passwordEncoder.encode(rawPassword);
    }
}