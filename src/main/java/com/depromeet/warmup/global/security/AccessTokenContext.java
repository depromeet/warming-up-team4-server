package com.depromeet.warmup.global.security;

import io.grpc.Context;
import io.grpc.Metadata;
import lombok.Getter;
import lombok.experimental.UtilityClass;

import java.util.Optional;

@UtilityClass
public class AccessTokenContext {

    @Getter
    private final Metadata.Key<String> accessTokenMetadataKey = Metadata.Key.of("x-access-token",
            Metadata.ASCII_STRING_MARSHALLER);

    @Getter
    private final Metadata.Key<String> newAccessTokenMetadataKey = Metadata.Key.of("x-new-access-token",
            Metadata.ASCII_STRING_MARSHALLER);

    @Getter
    private final Context.Key<AccessToken> accessTokenKey = Context.key("accessToken");

    public Optional<AccessToken> getAccessToken() {
        return Optional.ofNullable(accessTokenKey.get());
    }
}
