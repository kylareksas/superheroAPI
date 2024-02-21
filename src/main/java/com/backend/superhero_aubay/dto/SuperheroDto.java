package com.backend.superhero_aubay.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SuperheroDto {

    private Long id;
    private String alias;
    private String firstName;
    private String lastName;
    private String tier;
    private int ranking;
}

