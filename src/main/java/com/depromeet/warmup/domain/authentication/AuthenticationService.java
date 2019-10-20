package com.depromeet.warmup.domain.authentication;

import com.depromeet.warmup.global.exception.ServiceRuntimeException;
import com.depromeet.warmup.global.exception.ServiceStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@Service
public class AuthenticationService {

    private final AuthenticationRepository authenticationRepository;

    public Mono<Authentication> save(final Authentication authentication) {
        try {
            return Mono.just(authenticationRepository.save(authentication));
        } catch (final DataIntegrityViolationException e) {
            return Mono.error(ServiceRuntimeException.status(ServiceStatus.DUPLICATED_EMAIL));
        }
    }

    public Mono<Authentication> findByEmail(final String email) {
        return Mono.justOrEmpty(authenticationRepository.findByEmail(email));
    }
}
