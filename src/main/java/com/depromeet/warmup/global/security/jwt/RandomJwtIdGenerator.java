package com.depromeet.warmup.global.security.jwt;

import com.depromeet.warmup.properties.SecurityProperties;
import com.depromeet.warmup.utils.random.RandomUtils;
import org.springframework.stereotype.Component;

@Component
public class RandomJwtIdGenerator implements JwtIdGenerator {

    private final int jwtIdLength;

    public RandomJwtIdGenerator(final SecurityProperties securityProperties) {
        jwtIdLength = securityProperties.getJwtIdLength();
    }

    @Override
    public String generate() {
        return RandomUtils.getSecureString(jwtIdLength);
    }
}
