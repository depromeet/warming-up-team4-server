package com.depromeet.warmup.global.security.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.depromeet.warmup.global.security.SecurityUser;
import com.depromeet.warmup.properties.ApplicationProperties;
import com.depromeet.warmup.properties.SecurityProperties;
import com.depromeet.warmup.utils.random.RandomUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;

@Slf4j
@Component
public class JwtManager implements JwtGenerator<SecurityUser>, JwtDecoder, JwtValidator {

    private static final String EXPIRED_ERROR_MESSAGE = "expired";
    private static final String EMAIL = "email";

    private final ApplicationProperties applicationProperties;
    private final SecurityProperties securityProperties;

    private final Algorithm algorithm;
    private final JWTVerifier verifier;

    public JwtManager(final ApplicationProperties applicationProperties,
                      final SecurityProperties securityProperties) {
        this.applicationProperties = applicationProperties;
        this.securityProperties = securityProperties;

        algorithm = Algorithm.HMAC512(securityProperties.getJwtSecurityKey());
        verifier = JWT.require(algorithm)
                .withIssuer(getIssuer())
                .acceptExpiresAt(getRefreshTermMillis())
                .build();
    }

    @Override
    public String generate(final SecurityUser user) {
        return JWT.create()
                .withIssuer(getIssuer())
                .withIssuedAt(new Date())
                .withExpiresAt(getExpiredAt())

                // Note: Put claim set here
                .withClaim(EMAIL, user.getEmail())

                .withJWTId(RandomUtils.getSecureString(securityProperties.getJwtIdLength()))
                .withKeyId(String.valueOf(user.getUserObjectId()))
                .sign(algorithm);
    }

    @Override
    public boolean isValid(final String jwtToken) {
        try {
            // TODO: error handling
            verifier.verify(jwtToken);
            return true;
        } catch (final JWTVerificationException e) {
            if (!e.getMessage().contains(EXPIRED_ERROR_MESSAGE)) {
                log.debug("JWT verification exception", e);
            }

            return false;
        }
    }

    @Override
    public DecodedJWT decode(final String encodedJwt) throws JWTDecodeException {
        return JWT.decode(encodedJwt);
    }

    private String getIssuer() {
        return applicationProperties.getName();
    }

    private long getRefreshTermMillis() {
        return securityProperties.getRefreshTerm()
                .toMillis();
    }

    private Date getExpiredAt() {
        return Date.from(Instant.now()
                .plus(securityProperties.getExpiredTerm()));
    }
}
