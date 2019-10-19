package com.depromeet.warmup.utils.random;

import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Alphabet {

    @Getter
    private final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Getter
    private final String lowerCase = upperCase.toLowerCase();
}
