package com.backend.superhero_aubay.controller;

import com.backend.superhero_aubay.dto.SuperheroDto;
import com.backend.superhero_aubay.service.SuperheroService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Annotation to create constructors automatically
@AllArgsConstructor
//Annotation to enable http requests for this class
@RestController
//Annotation to define base URL for all the rest APIs
@RequestMapping("/api/superheroes")
public class SuperheroController {

        private SuperheroService superheroService;

        // Add Superhero REST API
        @PostMapping
        public ResponseEntity <SuperheroDto> createSuperhero (@RequestBody SuperheroDto superheroDto){
            SuperheroDto savedSuperhero = superheroService.createSuperhero(superheroDto);
            return new ResponseEntity<>(savedSuperhero, HttpStatus.CREATED);
        }

}
