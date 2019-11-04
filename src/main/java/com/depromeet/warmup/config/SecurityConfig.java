package com.depromeet.warmup.config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.depromeet.warmup.properties.ApplicationProperties;
import com.depromeet.warmup.properties.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    @Bean
    public Algorithm algorithm(final SecurityProperties securityProperties) {
        return Algorithm.HMAC512(securityProperties.getJwtSecurityKey());
    }

    @Bean
    public JWTVerifier jwtVerifier(final Algorithm algorithm,
                                   final ApplicationProperties applicationProperties,
                                   final SecurityProperties securityProperties) {
        return JWT.require(algorithm)
                .withIssuer(applicationProperties.getName())
                .acceptExpiresAt(securityProperties.getRefreshTerm()
                        .toMillis())
                .build();
    }
}
