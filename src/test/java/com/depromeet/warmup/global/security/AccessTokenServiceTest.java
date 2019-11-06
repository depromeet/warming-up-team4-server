package com.depromeet.warmup.global.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.depromeet.warmup.support.RedisBaseSupports;
import com.depromeet.warmup.utils.random.RandomUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.test.StepVerifier;

class AccessTokenServiceTest extends RedisBaseSupports {

    @Autowired
    private AccessTokenService accessTokenService;

    private String token;
    private String id;

    @BeforeEach
    void setUp() {
        token = JWT.create().sign(Algorithm.HMAC512("secret"));
        id = RandomUtils.getTimebaseUUID();
    }

    @Test
    void save() {
        // given
        final var accessToken = AccessToken.builder()
                .token(token)
                .id(id)
                .timeToLiveMillis(1_000)
                .build();

        // when / then
        StepVerifier.create(accessTokenService.save(accessToken))
                .expectNextMatches(savedAccessToken -> savedAccessToken.verify(token))
                .expectComplete()
                .verify();
    }

    @Test
    void findById() {
        // given
        accessTokenService.save(AccessToken.builder()
                .token(token)
                .id(id)
                .timeToLiveMillis(1_000)
                .build());

        // when / then
        StepVerifier.create(accessTokenService.findById(id))
                .expectNextMatches(foundAccessToken -> foundAccessToken.verify(token))
                .expectComplete()
                .verify();
    }


    @Test
    void findByIdNotFound() {
        // when / then
        StepVerifier.create(accessTokenService.findById("NOT-FOUND"))
                .expectComplete()
                .verify();
    }

    @Test
    void expired() throws InterruptedException {
        // given
        final var timeToLiveMillis = 1_000;

        accessTokenService.save(AccessToken.builder()
                .token(token)
                .id(id)
                .timeToLiveMillis(timeToLiveMillis)
                .build());

        Thread.sleep(timeToLiveMillis);

        // when / then
        StepVerifier.create(accessTokenService.findById(id))
                .expectComplete()
                .verify();
    }
}