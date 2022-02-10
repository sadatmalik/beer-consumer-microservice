package com.sadatmalik.beerconsumer.events;

import com.sadatmalik.beerconsumer.web.model.BeerDto;

public class NewInventoryEvent extends BeerEvent {
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}