package com.depromeet.warmup.utils.random;

public class Digit {

    static final int MIN = 0;
    static final int MAX = 9;

    private final int digit;

    Digit(final int digit) {
        if (MIN > digit || digit > MAX) {
            throw new IllegalArgumentException();
        }

        this.digit = digit;
    }

    @Override
    public String toString() {
        return String.valueOf(digit);
    }
}
