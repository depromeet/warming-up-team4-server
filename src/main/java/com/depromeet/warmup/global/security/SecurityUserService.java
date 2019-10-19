package com.depromeet.warmup.global.security;

import com.depromeet.warmup.domain.authentication.AuthenticationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SecurityUserService implements UserDetailsService {

    private final AuthenticationRepository authenticationRepository;

    @Override
    public UserDetails loadUserByUsername(final String email) throws UsernameNotFoundException {
        // TODO: error handling
        return authenticationRepository.findByEmail(email)
                .map(SecurityUser::of)
                .orElseThrow();
    }
}
