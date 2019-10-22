package com.depromeet.warmup.global.security;

import org.springframework.data.repository.CrudRepository;

interface AccessTokenRepository extends CrudRepository<AccessToken, String> {
}
