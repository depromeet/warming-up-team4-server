package com.depromeet.warmup.global.security.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.depromeet.warmup.domain.authentication.Authentication;
import com.depromeet.warmup.global.security.AccessToken;
import com.depromeet.warmup.global.security.AccessTokenService;
import com.depromeet.warmup.properties.ApplicationProperties;
import com.depromeet.warmup.properties.SecurityProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

@Slf4j
@Component
public class DefaultJwtManager implements JwtManager<Authentication> {

    private static final String EXPIRED_ERROR_MESSAGE = "expired";

    private static final String EMAIL_CLAIM_KEY = "email";
    private static final String NICKNAME_CLAIM_KEY = "nickname";

    private final String issuer;
    private final Duration expiredTerm;
    private final Duration refreshTerm;

    private final Algorithm algorithm;
    private final JwtIdGenerator jwtIdGenerator;
    private final JWTVerifier jwtVerifier;

    private final AccessTokenService accessTokenService;

    public DefaultJwtManager(final AccessTokenService accessTokenService,
                             final ApplicationProperties applicationProperties,
                             final SecurityProperties securityProperties,
                             final Algorithm algorithm,
                             final JwtIdGenerator jwtIdGenerator,
                             final JWTVerifier jwtVerifier) {
        this.accessTokenService = accessTokenService;

        issuer = applicationProperties.getName();
        expiredTerm = securityProperties.getExpiredTerm();
        refreshTerm = securityProperties.getRefreshTerm();

        this.algorithm = algorithm;
        this.jwtIdGenerator = jwtIdGenerator;
        this.jwtVerifier = jwtVerifier;
    }

    public String renew(final DecodedJWT decodedJWT) {
        return generate(decodedJWT.getClaim(EMAIL_CLAIM_KEY).asString(),
                decodedJWT.getClaim(NICKNAME_CLAIM_KEY).asString(),
                decodedJWT.getKeyId());
    }

    @Override
    public boolean isValid(final String jwtToken) {
        try {
            jwtVerifier.verify(jwtToken);
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

    @Override
    public String generate(final Authentication authentication) {
        return generate(authentication.getEmail(),
                authentication.getNickname(),
                String.valueOf(authentication.getUserObjectId()));
    }

    private String generate(final String email,
                            final String nickname,
                            final String userObjectId) {
        final var jwtId = jwtIdGenerator.generate();

        final var token = JWT.create()
                .withIssuer(issuer)
                .withIssuedAt(new Date())
                .withExpiresAt(getExpiredAt())

                // Note: Put claim set here
                .withClaim(EMAIL_CLAIM_KEY, email)
                .withClaim(NICKNAME_CLAIM_KEY, nickname)

                .withJWTId(jwtId)
                .withKeyId(userObjectId)
                .sign(algorithm);

        save(jwtId, token);

        return token;
    }

    private Date getExpiredAt() {
        return Date.from(Instant.now()
                .plus(expiredTerm));
    }

    private void save(final String jwtId,
                      final String token) {
        accessTokenService.save(AccessToken.builder()
                .id(jwtId)
                .token(token)
                .timeToLiveMillis(expiredTerm.plus(refreshTerm).toMillis())
                .build())
                .block();
    }
}
