package com.depromeet.warmup.utils.random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class RandomUtilsTest {

    private Set<String> randomValues;

    @BeforeEach
    void setUp() {
        randomValues = new HashSet<>();
    }

    @Test
    void getSecureString() {
        for (var length = 20; length <= 50; length++) {
            // when
            final var secureString = RandomUtils.getSecureString(length);

            // then
            assertThat(secureString.length()).isEqualTo(length);
            assertThat(randomValues).doesNotContain(secureString);

            randomValues.add(secureString);
        }
    }

    @Test
    void getTimebaseUUID() {
        for (var i = 0; i < 1_000; i++) {
            // when
            final var timebaseUUID = RandomUtils.getTimebaseUUID();

            // then
            assertThat(randomValues).doesNotContain(timebaseUUID);

            randomValues.add(timebaseUUID);
        }
    }

    @Test
    void randomInt() {
        for (var i = 1; i < 1_000; i++) {
            // when
            final var randomInt = RandomUtils.randomInt(i);

            // then
            assertThat(randomInt).isLessThan(i);
        }
    }

    @Test
    void randomIntIllegalArgumentException() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> RandomUtils.randomInt(0));
    }

    @Test
    void randomAlphaNumeric() {
        for (var i = 0; i < 1_000; i++) {
            // when
            final var randomAlphaNumeric = RandomUtils.randomAlphaNumeric();

            // then
            assertThat(randomAlphaNumeric).isNotNull();
        }
    }
}
