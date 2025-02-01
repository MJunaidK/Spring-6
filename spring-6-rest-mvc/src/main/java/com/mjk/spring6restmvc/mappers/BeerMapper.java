/**
 * Created by Junaid on 1/24/2025
 */
package com.mjk.spring6restmvc.mappers;

import com.mjk.spring6restmvc.entities.Beer;
import com.mjk.spring6restmvc.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);


}
