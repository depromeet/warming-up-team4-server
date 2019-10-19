package com.depromeet.warmup.domain.system;

import com.depromeet.warmup.support.BaseSupports;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.test.StepVerifier;

class SystemServiceTest extends BaseSupports {

    @Autowired
    private SystemService systemService;

    @Test
    void getCurrentTimeMillis() {
        StepVerifier.create(systemService.getCurrentTimeMillis())
                .expectNextMatches(currentTimeMillis -> currentTimeMillis < System.currentTimeMillis() &&
                        currentTimeMillis > System.currentTimeMillis() - 1_000)
                .expectComplete()
                .verify();
    }
}