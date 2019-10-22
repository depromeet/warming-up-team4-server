package com.depromeet.warmup.global.security;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class AccessTokenService {

    private final AccessTokenRepository accessTokenRepository;

    public Mono<AccessToken> save(final AccessToken accessToken) {
        return Mono.just(accessTokenRepository.save(accessToken));
    }

    public Mono<AccessToken> findById(final String id) {
        return Mono.justOrEmpty(accessTokenRepository.findById(id));
    }
}
