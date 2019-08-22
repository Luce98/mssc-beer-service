package luce.springframework.msscbeerservice.services;

import luce.springframework.msscbeerservice.web.model.BeerDto;
import luce.springframework.msscbeerservice.web.model.BeerPagedList;
import luce.springframework.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

/**
 * Created by jt on 2019-06-06.
 */
public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
