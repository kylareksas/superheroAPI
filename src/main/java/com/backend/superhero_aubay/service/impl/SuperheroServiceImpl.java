package com.backend.superhero_aubay.service.impl;

import com.backend.superhero_aubay.dto.SuperheroDto;
import com.backend.superhero_aubay.entities.Superhero;
import com.backend.superhero_aubay.exception.ResourceNotFoundException;
import com.backend.superhero_aubay.mapper.SuperheroMapper;
import com.backend.superhero_aubay.repository.SuperheroRepository;
import com.backend.superhero_aubay.service.SuperheroService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public SuperheroDto getSuperheroById(Long superheroId) {

        Superhero superhero = superheroRepository.findById(superheroId).orElseThrow(() -> new ResourceNotFoundException("Superhero not found with given id: " + superheroId));
        return SuperheroMapper.mapToSuperheroDto(superhero);
    }

    @Override
    public List<SuperheroDto> getAllSuperheroes() {
        List<Superhero> superheroes = superheroRepository.findAll();
        return superheroes.stream().map((superhero -> SuperheroMapper.mapToSuperheroDto(superhero))).collect(Collectors.toList());
    }

    @Override
    public SuperheroDto updateSuperhero(Long superheroId, SuperheroDto updatedSuperhero) {

        Superhero superhero = superheroRepository.findById(superheroId).orElseThrow(
                () -> new ResourceNotFoundException("Superhero not found with given id: " + superheroId)
        );

        superhero.setAlias(updatedSuperhero.getAlias());
        superhero.setFirstName(updatedSuperhero.getFirstName());
        superhero.setLastName(updatedSuperhero.getLastName());
        superhero.setTier(updatedSuperhero.getTier());
        superhero.setRanking(updatedSuperhero.getRanking());

        Superhero updatedSuperheroObj = superheroRepository.save(superhero);

        return SuperheroMapper.mapToSuperheroDto(updatedSuperheroObj);
    }


}
