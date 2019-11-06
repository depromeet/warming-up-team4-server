package com.depromeet.warmup.domain.item;

import com.depromeet.warmup.domain.barter.BarterStatus;
import com.depromeet.warmup.global.entity.DateAuditEntity;
import com.depromeet.warmup.global.entity.ProtobufConverter;
import com.depromeet.warmup.grpc.entity.ItemOuterClass;
import com.depromeet.warmup.grpc.type.BarterStatusOuterClass;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table
@Entity
public class Item extends DateAuditEntity implements ProtobufConverter<ItemOuterClass.Item> {

    @Column(nullable = false)
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BarterStatus barterStatus;

    // TODO: User

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String place;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @Column(nullable = false)
    private String tag;

    @Builder
    public Item(final String name,
                final String description,
                final List<String> image,
                final String place,
                final Category category,
                final String tag,
                final LocalDateTime createDate) {
        barterStatus = BarterStatus.WAIT;

        this.name = name;
        this.description = description;
        this.image = String.join(",", image);
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
                .addAllImages(Arrays.stream(image.split(",")).collect(Collectors.toList()))
                .setPlace(place)
                .setCategory(category.toProtobuf())
                .setTag(tag)
                .setCreatedDate(getCreatedDateMillis())
                .build();
    }
}
