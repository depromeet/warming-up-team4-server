package com.depromeet.warmup.utils.random;

import lombok.Getter;
import lombok.experimental.UtilityClass;

import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;

@UtilityClass
public class Digits {

    @Getter
    private final String digits = IntStream.rangeClosed(Digit.MIN, Digit.MAX)
            .mapToObj(Digit::new)
            .map(Object::toString)
            .collect(joining());
}
