package com.one.digitalinnovation.beerstock.mapper;

import com.one.digitalinnovation.beerstock.dto.BeerDTO;
import com.one.digitalinnovation.beerstock.entity.Beer;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}