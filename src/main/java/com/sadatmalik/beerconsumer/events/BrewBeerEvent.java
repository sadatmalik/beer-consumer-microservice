package com.sadatmalik.beerconsumer.events;

import com.sadatmalik.beerconsumer.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent {

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}