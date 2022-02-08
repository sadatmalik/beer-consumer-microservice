package com.sadatmalik.beerconsumer.web.mappers;

import com.sadatmalik.beerconsumer.domain.Beer;
import com.sadatmalik.beerconsumer.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}