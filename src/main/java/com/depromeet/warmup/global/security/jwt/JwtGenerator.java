package com.depromeet.warmup.global.security.jwt;

@FunctionalInterface
public interface JwtGenerator<T> {

    String generate(final T user);
}
