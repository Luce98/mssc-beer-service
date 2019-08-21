package luce.springframework.msscbeerservice.services;

import luce.springframework.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeerById(UUID beerId, BeerDto beerDto);

}
