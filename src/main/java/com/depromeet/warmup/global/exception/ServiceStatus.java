package com.depromeet.warmup.global.exception;

public enum ServiceStatus {

    // Common
    BAD_REQUEST,
    UNKNOWN_INTERNAL_ERROR,
    NOT_IMPLEMENTED_YET,

    // Authentication
    INVALID_ACCESS_TOKEN,
    ACCESS_TOKEN_EXPIRED,
    SIGN_IN_ANOTHER_DEVICE,
    DUPLICATED_EMAIL,
    AUTHENTICATION_NOT_FOUND,

    // University
    UNIVERSITY_NOT_FOUND,
    ;
}
