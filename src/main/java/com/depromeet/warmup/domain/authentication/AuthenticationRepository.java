package com.depromeet.warmup.domain.authentication;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthenticationRepository extends JpaRepository<Authentication, Long> {

    Optional<Authentication> findByEmail(final String email);
}
