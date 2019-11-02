package com.depromeet.warmup.domain.chat;

import com.depromeet.warmup.grpc.service.ChatGrpc;
import com.depromeet.warmup.grpc.service.ChatOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import lombok.Synchronized;
import net.devh.boot.grpc.server.service.GrpcService;
import reactor.core.publisher.UnicastProcessor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@RequiredArgsConstructor
@GrpcService
public class ChatController extends ChatGrpc.ChatImplBase {

    // TODO refactor (시간 부족으로 인한 일단 구현)

    private final Map<Long, UnicastProcessor<String>> rooms = new ConcurrentHashMap<>();

    private final AtomicLong autoIncrement = new AtomicLong();

    @Override
    public StreamObserver<ChatOuterClass.ChatRequest> join(
            final StreamObserver<ChatOuterClass.ChatResponse> responseObserver) {
//        final var accessToken = AccessTokenContext.getAccessToken()
//                .orElseThrow(() -> ServiceRuntimeException.status(ServiceStatus.BAD_REQUEST));
        final var from = autoIncrement.incrementAndGet(); // accessToken.getUserId();
        final var room = getRoom(from);

        room.subscribe(message -> responseObserver.onNext(ChatOuterClass.ChatResponse.newBuilder()
                        .setFrom(from)
                        .setMessage(message)
                        .build()),
                responseObserver::onError,
                responseObserver::onCompleted);

        return new StreamObserver<>() {
            @Override
            public void onNext(final ChatOuterClass.ChatRequest value) {
                getRoom(value.getTo()).onNext(value.getMessage());
            }

            @Override
            public void onError(final Throwable ignored) { }

            @Override
            public void onCompleted() { }
        };
    }

    @Synchronized
    private UnicastProcessor<String> getRoom(final Long userId) {
        return rooms.computeIfAbsent(userId, (ignored) -> UnicastProcessor.create());
    }
}
