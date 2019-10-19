package com.depromeet.warmup.properties;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Data
@Configuration
@ConfigurationProperties(prefix = "custom.security")
public class SecurityProperties {

    @Getter
    private int passwordEncodeStrength;

    @Getter
    private JwtProperties jwt;

    public String getJwtSecurityKey() {
        return jwt.getSecretKey();
    }

    public Duration getExpiredTerm() {
        return jwt.getExpiredTerm();
    }

    public Duration getRefreshTerm() {
        return jwt.getRefreshTerm();
    }

    public int getJwtIdLength() {
        return jwt.getJwtIdLength();
    }
}
