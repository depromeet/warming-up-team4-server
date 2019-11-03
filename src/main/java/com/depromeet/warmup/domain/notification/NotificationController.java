package com.depromeet.warmup.domain.notification;

import com.depromeet.warmup.grpc.service.NotificationGrpc;
import com.depromeet.warmup.grpc.service.NotificationOuterClass;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import lombok.Synchronized;
import net.devh.boot.grpc.server.service.GrpcService;
import reactor.core.publisher.UnicastProcessor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@GrpcService
public class NotificationController extends NotificationGrpc.NotificationImplBase {

    // TODO refactor (시간 부족으로 인한 일단 구현)

    public static final Map<Long, UnicastProcessor<NotificationOuterClass.Alarm>> notifications =
            new ConcurrentHashMap<>();

    private final AtomicLong autoIncrement = new AtomicLong();

    @Override
    public void subscribe(final Empty request,
                          final StreamObserver<NotificationOuterClass.Alarm> responseObserver) {
        //        final var accessToken = AccessTokenContext.getAccessToken()
//                .orElseThrow(() -> ServiceRuntimeException.status(ServiceStatus.BAD_REQUEST));
        final var from = autoIncrement.incrementAndGet(); // accessToken.getUserId();
        final var notification = getNotification(from);

        notification.subscribe(responseObserver::onNext,
                responseObserver::onError,
                responseObserver::onCompleted);
    }

    @Synchronized
    private UnicastProcessor<NotificationOuterClass.Alarm> getNotification(final Long userId) {
        return notifications.computeIfAbsent(userId, (ignored) -> UnicastProcessor.create());
    }
}
