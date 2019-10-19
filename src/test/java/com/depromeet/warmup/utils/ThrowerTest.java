package com.depromeet.warmup.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ThrowerTest {

    @Test
    void just() {
        Assertions.assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> Thrower.just(new Exception()));
    }
}