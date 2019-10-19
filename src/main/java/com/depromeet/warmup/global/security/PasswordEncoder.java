package com.depromeet.warmup.global.security;

import com.depromeet.warmup.properties.SecurityProperties;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoder extends BCryptPasswordEncoder {

    public PasswordEncoder(final SecurityProperties securityProperties) {
        super(securityProperties.getPasswordEncodeStrength());
    }
}
