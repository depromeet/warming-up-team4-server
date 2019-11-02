package com.depromeet.warmup.global.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.concurrent.TimeUnit;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@RedisHash
public class AccessToken {

    public static final String EMAIL_CLAIM_KEY = "email";
    public static final String NICKNAME_CLAIM_KEY = "nickname";

    @Id
    private String id;

    private String token;

    @TimeToLive(unit = TimeUnit.MILLISECONDS)
    private long timeToLiveMillis;

    @Transient
    private DecodedJWT decodedJWT;

    @Builder
    private AccessToken(final String id,
                        final String token,
                        final long timeToLiveMillis) {
        this.id = id;
        this.token = token;
        this.timeToLiveMillis = timeToLiveMillis;
        decodedJWT = JWT.decode(token);
    }

    public boolean verify(final String token) {
        return this.token.equals(token);
    }

    public long getUserId() {
        return Long.parseLong(decodedJWT.getKeyId());
    }

    public String getEmail() {
        return decodedJWT.getClaim(AccessToken.EMAIL_CLAIM_KEY)
                .asString();
    }

    public String getNickname() {
        return decodedJWT.getClaim(AccessToken.NICKNAME_CLAIM_KEY)
                .asString();
    }

}
