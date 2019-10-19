package com.depromeet.warmup.utils.random;

import lombok.experimental.UtilityClass;

@UtilityClass
public class AlphaNumeric {

    final String alphaNumeric = Alphabet.getUpperCase() + Alphabet.getLowerCase() + Digits.getDigits();

    public int length() {
        return alphaNumeric.length();
    }

    char getChar(final int position) throws IndexOutOfBoundsException {
        return alphaNumeric.charAt(position);
    }
}
