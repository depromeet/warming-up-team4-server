package com.depromeet.warmup.global.security.jwt;

import net.devh.boot.grpc.server.security.authentication.BearerAuthenticationReader;
import org.springframework.stereotype.Component;

@Component
public class JwtAuthenticationReader extends BearerAuthenticationReader {

    public JwtAuthenticationReader() {
        super(JwtAuthentication::of);
    }
}
