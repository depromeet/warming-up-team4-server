package com.depromeet.warmup.global.exception;

public enum ServiceStatus {

    // Common
    BAD_REQUEST,
    UNKNOWN_INTERNAL_ERROR,
    NOT_IMPLEMENTED_YET,

    // Authentication
    DUPLICATED_EMAIL,
    AUTHENTICATION_NOT_FOUND,

    // University
    UNIVERSITY_NOT_FOUND,
}
