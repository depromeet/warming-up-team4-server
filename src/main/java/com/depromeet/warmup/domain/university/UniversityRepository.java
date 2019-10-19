package com.depromeet.warmup.domain.university;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UniversityRepository extends JpaRepository<University, Long> {

    Optional<University> findByEmailDomain(final String emailDomain);
}
