package com.depromeet.warmup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.embedded.RedisServer;

@SpringBootApplication
public class Application {

    public static void main(final String... args) {
        RedisServer.builder().build().start();

        SpringApplication.run(Application.class, args);
    }
}
