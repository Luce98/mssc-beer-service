package luce.springframework.msscbeerservice.web.mappers;

import luce.springframework.msscbeerservice.domain.Beer;
import luce.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = { DateMapper.class })
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);

}
