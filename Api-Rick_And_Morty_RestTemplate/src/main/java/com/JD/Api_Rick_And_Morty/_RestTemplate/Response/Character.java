package com.JD.Api_Rick_And_Morty._RestTemplate.Response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class Character {

    private Long id;
    private String name;
    private String status;
    private String species;
    private String image;
    private List<String> episode;
}
