package com.depromeet.warmup.global.security.jwt;

import org.springframework.security.core.userdetails.UserDetails;

@FunctionalInterface
public interface JwtGenerator<T extends UserDetails> {

    String generate(final T user);
}
