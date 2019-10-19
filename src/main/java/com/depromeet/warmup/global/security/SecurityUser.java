package com.depromeet.warmup.global.security;

import com.depromeet.warmup.domain.authentication.Authentication;
import org.springframework.security.core.userdetails.User;

import static java.util.Collections.emptyList;

public class SecurityUser extends User {

    private final Authentication authentication;

    private SecurityUser(final Authentication authentication) {
        super(authentication.getEmail(), authentication.getPassword(), emptyList());

        this.authentication = authentication;
    }

    public static SecurityUser of(final Authentication authentication) {
        return new SecurityUser(authentication);
    }

    public long getUserObjectId() {
        return authentication.getUserObjectId();
    }

    public String getEmail() {
        return authentication.getEmail();
    }
}
