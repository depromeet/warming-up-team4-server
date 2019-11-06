package com.depromeet.warmup.domain.item;

import com.depromeet.warmup.grpc.type.CategoryType;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Optional;

@RequiredArgsConstructor
public enum Category {
    FOOD(CategoryType.Categories.FOOD, true),
    WOMAN(CategoryType.Categories.WOMAN, true),
    MAN(CategoryType.Categories.MAN, true),
    NECESSARIES(CategoryType.Categories.NECESSARIES, true),
    BEAUTY(CategoryType.Categories.BEAUTY, true),
    ELECTRONICS(CategoryType.Categories.ELECTRONICS, true),
    BOOK(CategoryType.Categories.BOOK, true),
    FURNITURE(CategoryType.Categories.FURNITURE, true),
    PET(CategoryType.Categories.PET, true),
    ETC(CategoryType.Categories.ETC, true);


    private final CategoryType.Categories protobufType;
    private final boolean canChange;

    public static Category from(final CategoryType.Categories protobufType) {
        return Arrays.stream(values())
                .filter(barterStatus -> barterStatus.protobufType == protobufType)
                .findFirst()
                .orElseThrow();
    }

    public boolean canNotChange() {
        return !canChange;
    }

    public CategoryType.Categories toProtobuf() {
        return protobufType;
    }
}

