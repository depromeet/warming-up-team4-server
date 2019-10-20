package com.depromeet.warmup.global.security.jwt;

import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.Getter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.List;

public class JwtAuthentication implements Authentication {

    @Getter
    private boolean authenticated = false;

    @Getter
    private String credentials; // jwt token

    @Getter
    private DecodedJWT details;

    @Getter
    private String name; // email

    private JwtAuthentication(final String jwtToken) {
        this.credentials = jwtToken;
    }

    public static Authentication of(final String jwtToken) {
        return new JwtAuthentication(jwtToken);
    }

    public void bind(final DecodedJWT decodedJWT) {
        details = decodedJWT;

        name = decodedJWT.getClaim("email").asString();

        authenticated = true;
    }

    // equals getCredentials
    public String getJwtToken() {
        return credentials;
    }

    public boolean isExpired() {
        return details.getExpiresAt().getTime() <= System.currentTimeMillis();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO: admin?
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public Object getPrincipal() {
        return this;
    }

    @Override
    public void setAuthenticated(boolean ignore) { }
}
