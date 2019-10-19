package com.depromeet.warmup.global.security.jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class JwtAuthenticationProvider implements AuthenticationProvider {

    private final JwtDecoder jwtDecoder;
    private final JwtValidator jwtValidator;

    @Override
    public Authentication authenticate(final Authentication input) throws AuthenticationException {
        final var jwtAuthentication = (JwtAuthentication) input;

        final var jwtToken = jwtAuthentication.getJwtToken();
        if (isInvalid(jwtToken)) {
            // TODO: error handling
        }

        jwtAuthentication.bind(jwtDecoder.decode(jwtToken));
        if (jwtAuthentication.isExpired()) {
            // TODO: generate refresh token?
        }

        return jwtAuthentication;
    }

    @Override
    public boolean supports(final Class<?> clazz) {
        return JwtAuthentication.class.isAssignableFrom(clazz);
    }

    private boolean isInvalid(final String jwtToken) {
        return !jwtValidator.isValid(jwtToken);
    }
}
