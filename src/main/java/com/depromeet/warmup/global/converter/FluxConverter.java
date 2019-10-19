package com.depromeet.warmup.global.converter;

import reactor.core.publisher.Flux;

@FunctionalInterface
public interface FluxConverter<I, O> extends Converter<I, Flux<O>> {
}
