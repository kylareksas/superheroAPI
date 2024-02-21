package com.backend.superhero_aubay.mapper;

import com.backend.superhero_aubay.dto.SuperheroDto;
import com.backend.superhero_aubay.entities.Superhero;

public class SuperheroMapper {
    public static SuperheroDto mapToSuperheroDto(Superhero superhero){
        return new SuperheroDto(

                superhero.getId(),
                superhero.getAlias(),
                superhero.getFirstName(),
                superhero.getLastName(),
                superhero.getTier(),
                superhero.getRanking()
        );
    }

    public static Superhero mapToSuperhero (SuperheroDto superheroDto){
        return new Superhero(

                superheroDto.getId(),
                superheroDto.getAlias(),
                superheroDto.getFirstName(),
                superheroDto.getLastName(),
                superheroDto.getTier(),
                superheroDto.getRanking()

        );
    }
}
