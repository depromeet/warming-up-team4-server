package com.depromeet.warmup.domain.item;

import com.depromeet.warmup.global.converter.MonoConverter;
import com.depromeet.warmup.grpc.service.ItemOuterClass;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ItemConverter implements MonoConverter<ItemOuterClass.SaveRequest, Item> {

    @Override
    public Mono<Item> convert(final ItemOuterClass.SaveRequest in) {
        return Mono.just(Item.builder()
                .name(in.getName())
                .description(in.getDescription())
                .build());
    }
}
