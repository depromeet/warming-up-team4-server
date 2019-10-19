package com.depromeet.warmup.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Thrower {

    public void just(final Throwable throwable) {
        throw new RuntimeException(throwable);
    }
}
