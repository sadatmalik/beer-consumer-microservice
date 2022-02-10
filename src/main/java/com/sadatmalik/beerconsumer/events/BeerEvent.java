package com.sadatmalik.beerconsumer.events;

import com.sadatmalik.beerconsumer.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -5781515597148163111L;

    private final BeerDto beerDto;
}