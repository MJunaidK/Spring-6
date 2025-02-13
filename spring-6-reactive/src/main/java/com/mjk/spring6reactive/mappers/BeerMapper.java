/**
 * Created by Junaid on 2/11/2025
 */
package com.mjk.spring6reactive.mappers;

import com.mjk.spring6reactive.domain.Beer;
import com.mjk.spring6reactive.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO beerDTO);

    BeerDTO beerToBeerDto(Beer beer);
}
