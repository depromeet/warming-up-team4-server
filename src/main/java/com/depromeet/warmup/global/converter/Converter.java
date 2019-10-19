package com.depromeet.warmup.global.converter;

@FunctionalInterface
public interface Converter<I, O> {

    O convert(final I in);
}
