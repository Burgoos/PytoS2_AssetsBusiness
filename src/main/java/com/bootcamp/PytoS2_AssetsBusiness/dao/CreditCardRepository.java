package com.bootcamp.PytoS2_AssetsBusiness.dao;

import com.bootcamp.PytoS2_AssetsBusiness.model.CreditCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CreditCardRepository extends ReactiveMongoRepository<CreditCard, Integer> {
    public Mono<CreditCard> findByIdClient(Integer idClient);
}
