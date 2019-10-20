package com.depromeet.warmup.domain.authentication;

import com.depromeet.warmup.domain.university.University;
import com.depromeet.warmup.domain.university.UniversityService;
import com.depromeet.warmup.global.exception.ServiceRuntimeException;
import com.depromeet.warmup.support.BaseSupports;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import reactor.test.StepVerifier;

class AuthenticationServiceTest extends BaseSupports {

    private static final String SYMBOL_OF_EMAIL_DOMAIN = "@";
    private static final int POSITION_OF_EMAIL_DOMAIN = 1;

    private static final String EMAIL = "jaeyeonling@gmail.com";
    private static final String PASSWORD = "password";
    private static final String NICKNAME = "Jaeyeonling";

    @Autowired
    private UniversityService universityService;

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void save() {
        universityService.save(University.builder()
                .emailDomain(EMAIL.split(SYMBOL_OF_EMAIL_DOMAIN)[POSITION_OF_EMAIL_DOMAIN])
                .name("test")
                .build())
                .block();

        StepVerifier.create(authenticationService.save(Authentication.builder()
                .email(EMAIL)
                .password(passwordEncoder.encode(PASSWORD))
                .nickname(NICKNAME)
                .build()))
                .expectNextMatches(savedAuthentication -> savedAuthentication.getId() != 0 &&
                        savedAuthentication.getEmail().equals(EMAIL) &&
                        passwordEncoder.matches(PASSWORD, savedAuthentication.getPassword()) &&
                        savedAuthentication.getNickname().equals(NICKNAME))
                .expectComplete()
                .verify();
    }

    @Test
    void saveDuplicateEmail() {
        universityService.save(University.builder()
                .emailDomain(EMAIL.split(SYMBOL_OF_EMAIL_DOMAIN)[POSITION_OF_EMAIL_DOMAIN])
                .name("test")
                .build())
                .block();

        final var savedAuthentication = authenticationService.save(Authentication.builder()
                .email(EMAIL)
                .password(passwordEncoder.encode(PASSWORD))
                .nickname(NICKNAME)
                .build())
                .block();

        StepVerifier.create(authenticationService.save(Authentication.builder()
                .email(savedAuthentication.getEmail())
                .password(savedAuthentication.getPassword())
                .nickname(savedAuthentication.getNickname())
                .build()))
                .expectError(ServiceRuntimeException.class)
                .verify();
    }
}