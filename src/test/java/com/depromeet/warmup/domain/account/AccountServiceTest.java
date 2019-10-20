package com.depromeet.warmup.domain.account;

import com.depromeet.warmup.domain.authentication.Authentication;
import com.depromeet.warmup.domain.university.University;
import com.depromeet.warmup.domain.university.UniversityService;
import com.depromeet.warmup.global.exception.ServiceRuntimeException;
import com.depromeet.warmup.support.BaseSupports;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import reactor.test.StepVerifier;

import static org.assertj.core.api.Assertions.assertThat;

class AccountServiceTest extends BaseSupports {

    private static final String SYMBOL_OF_EMAIL_DOMAIN = "@";
    private static final int POSITION_OF_EMAIL_DOMAIN = 1;

    private static final String EMAIL = "jaeyeonling@gmail.com";
    private static final String PASSWORD = "password";
    private static final String NICKNAME = "Jaeyeonling";

    private static final String UNIVERSITY_EMAIL_DOMAIN = EMAIL.split(SYMBOL_OF_EMAIL_DOMAIN)[POSITION_OF_EMAIL_DOMAIN];
    private static final String UNIVERSITY_NAME = "test";

    @Autowired
    private UniversityService universityService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    void signUp() {
        // given
        saveUniversity();

        // when / then
        StepVerifier.create(accountService.signUp(Authentication.builder()
                .email(EMAIL)
                .password(PASSWORD)
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
    void signUpEmailDomainNotFound() {
        // when / then
        StepVerifier.create(accountService.signUp(Authentication.builder()
                .email(EMAIL)
                .password(PASSWORD)
                .nickname(NICKNAME)
                .build()))
                .expectError(ServiceRuntimeException.class)
                .verify();
    }

    @Test
    void signUpDuplicateEmail() {
        // given
        saveUniversity();

        final var savedAuthentication = saveAuthentication();

        // when / then
        StepVerifier.create(accountService.signUp(Authentication.builder()
                .email(savedAuthentication.getEmail())
                .password(savedAuthentication.getPassword())
                .nickname(savedAuthentication.getNickname())
                .build()))
                .expectError(ServiceRuntimeException.class)
                .verify();
    }

    @Test
    void signIn() {
        // given
        saveUniversity();

        final var savedAuthentication = saveAuthentication();

        // when / then
        StepVerifier.create(accountService.signIn(Authentication.builder()
                .email(EMAIL)
                .password(PASSWORD)
                .build()))
                .expectNextMatches(signInResponse -> {
                    assertThat(signInResponse.getAuthentication().getEmail())
                            .isEqualTo(EMAIL);
                    assertThat(signInResponse.getAuthentication().getUser().getNickname())
                            .isEqualTo(NICKNAME);
                    assertThat(signInResponse.getAuthentication().getUser().getUniversity().getEmailDomain())
                            .isEqualTo(UNIVERSITY_EMAIL_DOMAIN);
                    assertThat(signInResponse.getAuthentication().getUser().getUniversity().getName())
                            .isEqualTo(UNIVERSITY_NAME);

                    return true;
                })
                .expectComplete()
                .verify();
    }

    private University saveUniversity() {
        return universityService.save(University.builder()
                .emailDomain(UNIVERSITY_EMAIL_DOMAIN)
                .name(UNIVERSITY_NAME)
                .build())
                .block();
    }

    private Authentication saveAuthentication() {
        return accountService.signUp(Authentication.builder()
                .email(EMAIL)
                .password(PASSWORD)
                .nickname(NICKNAME)
                .build())
                .block();
    }
}