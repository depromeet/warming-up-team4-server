package com.depromeet.warmup.global.exception;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ServiceException extends Exception implements SystemException {

    private final ServiceStatus status;

    @Override
    public String getDescription() {
        return status.name();
    }
}
