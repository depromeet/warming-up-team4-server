package com.depromeet.warmup.global.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthenticationProviderManager extends ProviderManager {

    public AuthenticationProviderManager(final AuthenticationProvider authenticationProvider) {
        super(List.of(authenticationProvider));
    }
}
