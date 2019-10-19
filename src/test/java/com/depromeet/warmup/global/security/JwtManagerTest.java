package com.depromeet.warmup.global.security;

import com.depromeet.warmup.domain.authentication.Authentication;
import com.depromeet.warmup.global.security.jwt.JwtManager;
import com.depromeet.warmup.properties.ApplicationProperties;
import com.depromeet.warmup.properties.JwtProperties;
import com.depromeet.warmup.properties.SecurityProperties;
import com.depromeet.warmup.utils.random.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

class JwtManagerTest {

    private static final String EMAIL = "jaeyeonling@gmail.com";

    private org.springframework.security.crypto.password.PasswordEncoder passwordEncoder;
    private JwtManager jwtManager;

    @BeforeEach
    void setUp() {
        final var applicationProperties = new ApplicationProperties();
        applicationProperties.setName("name");
        applicationProperties.setVersion("0.0.1");

        final var jwtProperties = new JwtProperties();
        jwtProperties.setExpiredTerm(Duration.ofSeconds(20));
        jwtProperties.setHeaderName("authentication");
        jwtProperties.setJwtIdLength(128);
        jwtProperties.setRefreshTerm(Duration.ofSeconds(10));
        jwtProperties.setSecretKey("secret");

        final var securityProperties = new SecurityProperties();
        securityProperties.setPasswordEncodeStrength(6);
        securityProperties.setJwt(jwtProperties);

        passwordEncoder = new PasswordEncoder(securityProperties);

        jwtManager = new JwtManager(applicationProperties, securityProperties);
    }

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

        final var securityUser = SecurityUser.of(authentication);

        return jwtManager.generate(securityUser);
    }
}