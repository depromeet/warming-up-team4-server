package com.depromeet.warmup.utils;

import lombok.experimental.UtilityClass;
import org.springframework.lang.Nullable;

import javax.annotation.concurrent.ThreadSafe;
import java.util.Objects;

@ThreadSafe
@UtilityClass
public class StringUtils {

    public boolean isBlank(@Nullable final String accessToken) {
        return Objects.isNull(accessToken) || accessToken.isBlank();
    }
}
