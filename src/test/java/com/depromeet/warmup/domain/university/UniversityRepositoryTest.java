package com.depromeet.warmup.domain.university;

import com.depromeet.warmup.support.RepositorySupports;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import static org.assertj.core.api.Assertions.assertThat;

class UniversityRepositoryTest extends RepositorySupports {

    @Autowired
    private UniversityRepository universityRepository;

    @Test
    void findByEmailNotFound() {
        // when
        final var university = universityRepository.findByEmailDomain("not-found");

        // then
        assertThat(university).isEmpty();
    }

    @Test
    void findByEmail() {
        // given
        final var emailDomain = "gmail.com";
        final var university = University.builder()
                .emailDomain(emailDomain)
                .name("Google")
                .build();

        // when
        universityRepository.save(university);
        final var savedUniversity = universityRepository.findByEmailDomain(emailDomain);

        // then
        assertThat(savedUniversity).isPresent();
    }

    @Test
    void saveDuplicateEmail() {
        // given
        final var emailDomain = "gmail.com";
        final var university = University.builder()
                .emailDomain(emailDomain)
                .name("Google")
                .build();

        universityRepository.save(university);

        // when / then
        Assertions.assertThatExceptionOfType(DataIntegrityViolationException.class)
                .isThrownBy(() -> universityRepository.save(University.builder()
                        .emailDomain(emailDomain)
                        .name("Google")
                        .build()));
    }
}