package com.avifro.checkoutmyportfolio.web.rest;

import com.avifro.checkoutmyportfolio.domain.entities.TradableEntity;
import com.avifro.checkoutmyportfolio.repository.TradableEntityRepository;
import com.avifro.checkoutmyportfolio.security.AuthoritiesConstants;
import com.codahale.metrics.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;

/**
 * Created by avifro on 1/25/15.
 */

@RestController
@RequestMapping("/tradable_entities")
public class TradableEntityResource {


    private final Logger log = LoggerFactory.getLogger(TradableEntityResource.class);

    @Inject
    private TradableEntityRepository tradableEntityRepository;

    /**
     * GET  /tradable_entities/:symbol -> get the tradable entity by symbol.
     */
    @RequestMapping(value = "/tradable_entities/{symbol}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    @Timed
    @RolesAllowed(AuthoritiesConstants.USER)
    public ResponseEntity<TradableEntity> getTradableEntityBySymbol(String symbol) {
        return tradableEntityRepository.findOneBySymbol(symbol)
                .map((tradableEntity) -> new ResponseEntity<TradableEntity>(HttpStatus.OK))
                .orElse(new ResponseEntity<TradableEntity>(HttpStatus.NOT_FOUND));
    }
}
