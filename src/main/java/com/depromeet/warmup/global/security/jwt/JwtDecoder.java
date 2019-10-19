package com.depromeet.warmup.global.security.jwt;

import com.auth0.jwt.interfaces.DecodedJWT;

@FunctionalInterface
public interface JwtDecoder {

    DecodedJWT decode(final String encodedJwt);
}
