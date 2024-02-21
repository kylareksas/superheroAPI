package com.backend.superhero_aubay.service;

import com.backend.superhero_aubay.dto.SuperheroDto;

import java.util.List;

public interface SuperheroService {
    SuperheroDto createSuperhero (SuperheroDto superheroDto);
    SuperheroDto getSuperheroById (Long superheroId);
    List<SuperheroDto> getAllSuperheroes();
    SuperheroDto updateSuperhero (Long superheroId, SuperheroDto updatedSuperhero);

    void deleteSuperhero(Long superheroId);
}
