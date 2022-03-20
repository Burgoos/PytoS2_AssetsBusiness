package com.bootcamp.PytoS2_AssetsBusiness.dao;

import com.bootcamp.PytoS2_AssetsBusiness.model.Credit;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface CreditRepository extends ReactiveMongoRepository<Credit, Integer> {
    public Mono<Credit> findByIdClient(Integer idClient);
}
