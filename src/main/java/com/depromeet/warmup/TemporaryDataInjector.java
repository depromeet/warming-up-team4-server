package com.depromeet.warmup;

import com.depromeet.warmup.domain.university.University;
import com.depromeet.warmup.domain.university.UniversityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TemporaryDataInjector implements CommandLineRunner {

    private final UniversityRepository universityRepository;

    @Override
    public void run(String... args) {
        universityRepository.save(University.builder()
                .name("Test")
                .emailDomain("test.com")
                .build());
    }
}
