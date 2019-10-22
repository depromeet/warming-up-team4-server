package com.depromeet.warmup.global.security;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

import javax.persistence.Id;
import java.util.concurrent.TimeUnit;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RedisHash
public class AccessToken {

    @Id
    private String id;

    private String token;

    @TimeToLive(unit = TimeUnit.MILLISECONDS)
    private long timeToLiveMillis;

    @Builder
    private AccessToken(final String id,
                        final String token,
                        final long timeToLiveMillis) {
        this.id = id;
        this.token = token;
        this.timeToLiveMillis = timeToLiveMillis;
    }

    public boolean verify(final String token) {
        return this.token.equals(token);
    }
}
