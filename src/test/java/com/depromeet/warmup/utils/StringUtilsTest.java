package com.depromeet.warmup.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilsTest {

    @Test
    void isBlank() {
        assertThat(StringUtils.isBlank(null)).isTrue();
        assertThat(StringUtils.isBlank("")).isTrue();
        assertThat(StringUtils.isBlank(" ")).isTrue();
    }

    @Test
    void isNotBlank() {
        assertThat(StringUtils.isBlank("1")).isFalse();
        assertThat(StringUtils.isBlank(" a")).isFalse();
    }
}