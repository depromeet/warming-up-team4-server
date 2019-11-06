package com.depromeet.warmup.domain.item;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findItemByCategory(final Category category);
}
