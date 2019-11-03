package com.depromeet.warmup.config;

import com.depromeet.warmup.global.interceptor.ExceptionInterceptor;
import com.depromeet.warmup.global.interceptor.RuntimeExceptionInterceptor;
import net.devh.boot.grpc.server.interceptor.GlobalServerInterceptorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcConfig {

    @Bean
    public GlobalServerInterceptorConfigurer globalInterceptorConfigurerAdapter(
            final ExceptionInterceptor exceptionInterceptor,
            final RuntimeExceptionInterceptor runtimeExceptionInterceptor) {
        return registry -> registry.addServerInterceptors(exceptionInterceptor)
                .addServerInterceptors(runtimeExceptionInterceptor);
    }
}
