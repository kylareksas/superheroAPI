package com.backend.superhero_aubay.service.impl;

import com.backend.superhero_aubay.dto.SuperheroDto;
import com.backend.superhero_aubay.entities.Superhero;
import com.backend.superhero_aubay.mapper.SuperheroMapper;
import com.backend.superhero_aubay.repository.SuperheroRepository;
import com.backend.superhero_aubay.service.SuperheroService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/*
Annotation to create the spring bean for this class
 */
@Service
@AllArgsConstructor
public class SuperheroServiceImpl implements SuperheroService {

    private SuperheroRepository superheroRepository;

    @Override
    public SuperheroDto createSuperhero(SuperheroDto superheroDto) {
        Superhero superhero = SuperheroMapper.mapToSuperhero(superheroDto);
        Superhero savedSuperhero = superheroRepository.save(superhero);
        return SuperheroMapper.mapToSuperheroDto(savedSuperhero);
    }
}
