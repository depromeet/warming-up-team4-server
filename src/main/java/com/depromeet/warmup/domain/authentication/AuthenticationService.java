package com.depromeet.warmup.domain.authentication;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthenticationService {

    private final AuthenticationRepository authenticationRepository;
}
