package com.depromeet.warmup.properties;

import com.depromeet.warmup.support.BaseSupports;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

class SecurityPropertiesTest extends BaseSupports {

    @Autowired
    private SecurityProperties securityProperties;

    @Test
    void getJwtSecurityKey() {
        assertThat(securityProperties.getJwtSecurityKey()).isNotBlank();
    }

    @Test
    void getExpiredTerm() {
        assertThat(securityProperties.getExpiredTerm()).isNotNull();
    }

    @Test
    void getRefreshTerm() {
        assertThat(securityProperties.getRefreshTerm()).isNotNull();
    }

    @Test
    void getJwtIdLength() {
        assertThat(securityProperties.getJwtIdLength()).isNotZero();
    }
}