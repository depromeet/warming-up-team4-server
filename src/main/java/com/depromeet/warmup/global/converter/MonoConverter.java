package com.depromeet.warmup.global.converter;

import reactor.core.publisher.Mono;

@FunctionalInterface
public interface MonoConverter<I, O> extends Converter<I, Mono<O>> {
}
