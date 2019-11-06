package com.depromeet.warmup;

import com.depromeet.warmup.domain.account.AccountService;
import com.depromeet.warmup.domain.authentication.Authentication;
import com.depromeet.warmup.domain.university.University;
import com.depromeet.warmup.domain.university.UniversityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
@RequiredArgsConstructor
@Component
public class TemporaryDataInjector implements CommandLineRunner {

    private final AccountService accountService;
    private final UniversityRepository universityRepository;

    @Override
    public void run(String... args) {
        universityRepository.save(University.builder()
                .name("Test")
                .emailDomain("test.com")
                .build());

        final var authentication = accountService.signUp(Authentication.builder()
                .email("test@test.com")
                .password("test")
                .nickname("nickname")
                .build())
                .block();
        final var signInResponse = accountService.signIn(authentication).block();

        final var accessToken = signInResponse.getAccessToken();

        System.out.println(String.format("@@@ ACCESS_TOKEN :::: {\"x-access-token\": \"%s\"}", accessToken));
    }
}
