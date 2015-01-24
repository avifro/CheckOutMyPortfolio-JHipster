package com.avifro.checkoutmyportfolio.repository;

import com.avifro.checkoutmyportfolio.domain.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Authority entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}
