package com.depromeet.warmup.domain.item;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class ItemService {

    private final ItemRepository itemRepository;

    public Mono<Item> save(final Item item) {
        return Mono.just(itemRepository.save(item));
    }

    public Flux<Item> findAll() {
        return Flux.fromIterable(itemRepository.findAll());
    }

    public Mono<Item> findById(final long id) {
        return Mono.justOrEmpty(itemRepository.findById(id));
    }

    public Flux<Item> findItemByCategory(final Category category) {
        return Flux.fromIterable(itemRepository.findItemByCategory(category));
    }

}
