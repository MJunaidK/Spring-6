package com.mjk.reactivemongo.mappers;

import com.mjk.reactivemongo.domain.Beer;
import com.mjk.reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;

/**
 * Created by jt, Spring Framework Guru.
 */
@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}
