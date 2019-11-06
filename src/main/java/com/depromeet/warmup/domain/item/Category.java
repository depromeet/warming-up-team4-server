package com.depromeet.warmup.domain.item;

import com.depromeet.warmup.grpc.type.CategoryType;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@RequiredArgsConstructor
public enum Category {

    FOOD(CategoryType.Categories.FOOD),
    WOMAN(CategoryType.Categories.WOMAN),
    MAN(CategoryType.Categories.MAN),
    NECESSARIES(CategoryType.Categories.NECESSARIES),
    BEAUTY(CategoryType.Categories.BEAUTY),
    ELECTRONICS(CategoryType.Categories.ELECTRONICS),
    BOOK(CategoryType.Categories.BOOK),
    FURNITURE(CategoryType.Categories.FURNITURE),
    PET(CategoryType.Categories.PET),
    ETC(CategoryType.Categories.ETC);

    private final CategoryType.Categories protobufType;

    public static Category from(final CategoryType.Categories protobufType) {
        return Arrays.stream(values())
                .filter(barterStatus -> barterStatus.protobufType == protobufType)
                .findFirst()
                .orElseThrow();
    }

    public CategoryType.Categories toProtobuf() {
        return protobufType;
    }
}

