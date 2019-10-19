package com.depromeet.warmup.utils.random;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class AlphaNumericTest {

    @Test
    void getChar() {
        for (var i = 0; i < AlphaNumeric.length(); i++) {
            // when
            final var charValue = AlphaNumeric.getChar(i);
            final var expected = AlphaNumeric.alphaNumeric.charAt(i);

            assertThat(charValue).isEqualTo(expected);
        }
    }

    @Test
    void getCharIndexOutOfBoundsException() {
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
                .isThrownBy(() -> AlphaNumeric.getChar(AlphaNumeric.length() + 1));
    }
}