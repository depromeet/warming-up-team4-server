package com.depromeet.warmup.domain.barter;

import com.depromeet.warmup.grpc.type.BarterStatusOuterClass;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Optional;

@RequiredArgsConstructor
public enum BarterStatus {

    WAIT(BarterStatusOuterClass.BarterStatus.WAIT, true),
    BARTERING(BarterStatusOuterClass.BarterStatus.BARTERING, true),
    BARTERED(BarterStatusOuterClass.BarterStatus.BARTERED, false),
    CANCELED(BarterStatusOuterClass.BarterStatus.CANCELED, true);

    private final BarterStatusOuterClass.BarterStatus protobufType;
    private final boolean canChange;

    public static Optional<BarterStatus> from(final BarterStatusOuterClass.BarterStatus protobufType) {
        return Arrays.stream(values())
                .filter(barterStatus -> barterStatus.protobufType == protobufType)
                .findFirst();
    }

    public boolean canNotChange() {
        return !canChange;
    }

    public BarterStatusOuterClass.BarterStatus toProtobuf() {
        return protobufType;
    }
}
