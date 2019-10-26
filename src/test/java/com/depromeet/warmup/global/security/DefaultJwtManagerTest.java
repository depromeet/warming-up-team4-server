package com.depromeet.warmup.global.security;

import com.depromeet.warmup.domain.authentication.Authentication;
import com.depromeet.warmup.global.security.jwt.JwtManager;
import com.depromeet.warmup.support.RedisBaseSupports;
import com.depromeet.warmup.utils.random.RandomUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

class DefaultJwtManagerTest extends RedisBaseSupports {

    private static final String EMAIL = "jaeyeonling@gmail.com";

    @Autowired
    private org.springframework.security.crypto.password.PasswordEncoder passwordEncoder;

    @Autowired
    private JwtManager<Authentication> jwtManager;

    @Test
    void isValid() {
        // when
        final var isValid = jwtManager.isValid(generateJwt());

        assertThat(isValid).isTrue();
    }

    @Test
    void isInvalid() {
        // given
        final var randomString = RandomUtils.getSecureString(RandomUtils.randomInt(200));

        // when
        final var isValid = jwtManager.isValid(randomString);

        // then
        assertThat(isValid).isFalse();
    }

    @Test
    void generate() {
        // when
        final var jwtToken = generateJwt();

        // then
        assertThat(jwtToken).isNotNull();
    }

    @Test
    void decode() {
        // given
        final var jwtToken = generateJwt();

        // when
        final var decodedJwt = jwtManager.decode(jwtToken);
        final var email = decodedJwt.getClaim("email")
                .asString();

        assertThat(email).isEqualTo(EMAIL);
    }

    private String generateJwt() {
        final var authentication = Authentication.builder()
                .email(EMAIL)
                .password(passwordEncoder.encode("password"))
                .build();

        return jwtManager.generate(authentication);
    }
}