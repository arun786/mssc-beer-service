package com.arun.msscbeerservice.web.service;

import com.arun.msscbeerservice.web.model.BeerDto;

public interface BeerService {

    BeerDto getBeerId(String uuid);

    BeerDto saveBeer(BeerDto beerDto);

    void updateBeer(String id, BeerDto beerDto);
}
