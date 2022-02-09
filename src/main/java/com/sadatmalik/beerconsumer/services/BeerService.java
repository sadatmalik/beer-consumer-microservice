package com.sadatmalik.beerconsumer.services;

import com.sadatmalik.beerconsumer.web.model.BeerDto;
import com.sadatmalik.beerconsumer.web.model.BeerPagedList;
import com.sadatmalik.beerconsumer.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest);

    BeerDto getById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}