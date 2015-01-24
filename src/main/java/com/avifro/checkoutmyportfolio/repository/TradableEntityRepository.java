package com.avifro.checkoutmyportfolio.repository;

import com.avifro.checkoutmyportfolio.domain.entities.TradableEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * Created by avifro on 1/25/15.
 */
public interface TradableEntityRepository  extends MongoRepository<TradableEntity, String> {

    Optional<TradableEntity> findOneBySymbol(String symbol);


}
