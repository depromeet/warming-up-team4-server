package com.depromeet.warmup.domain.account;

import com.depromeet.warmup.domain.authentication.Authentication;
import com.depromeet.warmup.domain.authentication.AuthenticationService;
import com.depromeet.warmup.domain.university.UniversityService;
import com.depromeet.warmup.global.exception.ServiceRuntimeException;
import com.depromeet.warmup.global.exception.ServiceStatus;
import com.depromeet.warmup.global.security.SecurityUser;
import com.depromeet.warmup.global.security.jwt.JwtGenerator;
import com.depromeet.warmup.grpc.service.AccountOuterClass;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class AccountService {

    private final AuthenticationService authenticationService;
    private final UniversityService universityService;

    private final JwtGenerator<SecurityUser> jwtGenerator;
    private final PasswordEncoder passwordEncoder;

    public Mono<Authentication> signUp(final Authentication authentication) {
        return universityService.findByEmailDomain(authentication.getEmailDomain())
                .switchIfEmpty(Mono.error(ServiceRuntimeException.status(ServiceStatus.UNIVERSITY_NOT_FOUND)))
                .map(authentication::setUniversity)
                .map(this::encodePassword)
                .flatMap(authenticationService::save)
                .flatMap(Mono::just);
    }

    public Mono<AccountOuterClass.SignInResponse> signIn(final Authentication authentication) {
        return authenticationService.findByEmail(authentication.getEmail())
                .filter(findAuthentication ->
                        passwordEncoder.matches(authentication.getPassword(), findAuthentication.getPassword()))
                .switchIfEmpty(Mono.error(ServiceRuntimeException.status(ServiceStatus.AUTHENTICATION_NOT_FOUND)))
                .map(findAuthentication -> AccountOuterClass.SignInResponse.newBuilder()
                        .setAuthentication(findAuthentication.toProtoBuf())
                        .setAccessToken(jwtGenerator.generate(SecurityUser.of(findAuthentication)))
                        .build())
                .flatMap(Mono::just);
    }

    private Authentication encodePassword(final Authentication authentication) {
        authentication.encodePassword(passwordEncoder);
        return authentication;
    }
}
