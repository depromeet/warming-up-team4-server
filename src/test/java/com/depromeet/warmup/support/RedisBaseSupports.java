package com.depromeet.warmup.support;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import redis.embedded.RedisServer;

import java.util.Optional;

public abstract class RedisBaseSupports extends BaseSupports {

    private RedisServer redisServer;

    @BeforeEach
    void setUp() {
        redisServer = RedisServer.builder()
                .build();
        redisServer.start();
    }

    @AfterEach
    void tearDown() {
        Optional.ofNullable(redisServer)
                .ifPresent(RedisServer::stop);
    }
}
