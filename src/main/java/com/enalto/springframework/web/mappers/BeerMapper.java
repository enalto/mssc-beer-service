package com.enalto.springframework.web.mappers;

import com.enalto.springframework.domain.Beer;
import com.enalto.springframework.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    Beer toEntity(BeerDto beerDto);

    BeerDto toDto(Beer beer);
}
