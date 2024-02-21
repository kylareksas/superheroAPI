package com.backend.superhero_aubay.controller;

import com.backend.superhero_aubay.dto.SuperheroDto;
import com.backend.superhero_aubay.service.SuperheroService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

        //Get Superhero by ID REST API
        @GetMapping ("{id}")
        public ResponseEntity <SuperheroDto> getSuperheroById(@PathVariable("id") Long superheroId){
            SuperheroDto superheroDto = superheroService.getSuperheroById(superheroId);
            return ResponseEntity.ok(superheroDto);
        }

        //Get all superheroes REST API
        @GetMapping
        public ResponseEntity<List<SuperheroDto>> getAllSuperheroes(){
            List<SuperheroDto> superheroes = superheroService.getAllSuperheroes();
            return ResponseEntity.ok(superheroes);
        }

        //Update superhero by ID REST API
        @PutMapping ("{id}")
        public ResponseEntity<SuperheroDto> updatedSuperhero(@PathVariable("id") Long superheroId, @RequestBody SuperheroDto updatedSuperhero){
            SuperheroDto superheroDto = superheroService.updateSuperhero(superheroId,updatedSuperhero);
            return ResponseEntity.ok(superheroDto);
        }

        //delete superhero by Id REST API
        @DeleteMapping ("{id}")
        public ResponseEntity<String> deleteSuperhero(@PathVariable("id")Long superheroId){
            superheroService.deleteSuperhero(superheroId);
            return ResponseEntity.ok("Superhero deleted");
        }
}
