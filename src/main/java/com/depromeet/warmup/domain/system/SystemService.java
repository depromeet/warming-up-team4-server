package com.depromeet.warmup.domain.system;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SystemService {

    public Mono<Long> getCurrentTimeMillis() {
        return Mono.just(System.currentTimeMillis());
    }
}
