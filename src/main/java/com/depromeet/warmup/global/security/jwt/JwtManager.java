package com.depromeet.warmup.global.security.jwt;

import com.auth0.jwt.interfaces.DecodedJWT;

public interface JwtManager<E> extends JwtDecoder, JwtValidator, JwtGenerator<E> {

    String renew(final DecodedJWT decodedJWT);
}
