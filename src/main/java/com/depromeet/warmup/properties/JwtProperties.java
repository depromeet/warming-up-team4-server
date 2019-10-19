package com.depromeet.warmup.properties;

import lombok.Data;

import java.time.Duration;

@Data
public class JwtProperties {

    private String secretKey;
    private Duration refreshTerm;
    private Duration expiredTerm;
    private int jwtIdLength;
    private String headerName;
}
