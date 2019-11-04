package com.depromeet.warmup.global.security.jwt;

@FunctionalInterface
public interface JwtIdGenerator {

    String generate();
}
