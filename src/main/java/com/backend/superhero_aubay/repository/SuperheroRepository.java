package com.backend.superhero_aubay.repository;

import com.backend.superhero_aubay.entities.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SuperheroRepository extends JpaRepository<Superhero,Long> {
        //List<Superhero> findAllByAliasContainingIgnoreCase(String superheroAlias);
}
