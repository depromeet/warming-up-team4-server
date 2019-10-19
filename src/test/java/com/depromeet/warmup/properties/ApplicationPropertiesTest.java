package com.depromeet.warmup.properties;

import com.depromeet.warmup.support.BaseSupports;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationPropertiesTest extends BaseSupports {

    @Autowired
    private ApplicationProperties applicationProperties;

    @Test
    void getName() {
        assertThat(applicationProperties.getName()).isNotBlank();
    }

    @Test
    void getVersion() {
        assertThat(applicationProperties.getVersion()).isNotBlank();
    }
}