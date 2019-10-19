package com.depromeet.warmup.domain.university;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
@RequiredArgsConstructor
public class UniversityService {

    private final UniversityRepository universityRepository;

    public Mono<University> findByEmailDomain(final String email) {
        return Mono.justOrEmpty(universityRepository.findByEmailDomain(email));
    }
}
