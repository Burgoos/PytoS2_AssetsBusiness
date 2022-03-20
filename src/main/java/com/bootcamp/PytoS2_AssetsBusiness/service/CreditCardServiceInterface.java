package com.bootcamp.PytoS2_AssetsBusiness.service;

import com.bootcamp.PytoS2_AssetsBusiness.model.CreditCard;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditCardServiceInterface {
    void addCreditCard(CreditCard creditCard);

    Mono<CreditCard> findCreditCardById(Integer id);

    Flux<CreditCard> findAllCreditCard();

    Mono<CreditCard> updateCreditCard(CreditCard creditCard);

    Mono<Void> deleteCreditCard(Integer id);

    Mono<CreditCard> findCreditCardByIdClient(Integer id);
}
