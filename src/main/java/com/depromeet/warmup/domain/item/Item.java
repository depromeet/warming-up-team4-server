package com.depromeet.warmup.domain.item;

import com.depromeet.warmup.domain.barter.BarterStatus;
import com.depromeet.warmup.global.entity.DateAuditEntity;
import com.depromeet.warmup.global.entity.ProtobufConverter;
import com.depromeet.warmup.grpc.entity.ItemOuterClass;
import com.depromeet.warmup.grpc.type.BarterStatusOuterClass;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table
@Entity
public class Item extends DateAuditEntity implements ProtobufConverter<ItemOuterClass.Item> {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BarterStatus barterStatus;

    // TODO: User

    // TODO: Images

    @Column(nullable = false)
    private String place;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String tag;

    @Builder
    public Item(final String name,
                final String description,
                final String place,
                final String category,
                final String tag) {
        barterStatus = BarterStatus.WAIT;

        this.name = name;
        this.description = description;
        this.place = place;
        this.category = category;
        this.tag = tag;
    }

    public void updateStatus(final BarterStatusOuterClass.BarterStatus protobufBarterStatus) {
        if (barterStatus.canNotChange()) {
            // TODO: error
        }

        barterStatus = BarterStatus.from(protobufBarterStatus)
                .orElseThrow();
    }

    @Override
    public ItemOuterClass.Item toProtoBuf() {
        return ItemOuterClass.Item.newBuilder()
                .setName(name)
                .setDescription(description)
                .setBarterStatus(barterStatus.toProtobuf())

                .build();
    }
}
