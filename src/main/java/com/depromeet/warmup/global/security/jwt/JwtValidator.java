package com.depromeet.warmup.global.security.jwt;

@FunctionalInterface
public interface JwtValidator {

    boolean isValid(final String jwtToken);
}
