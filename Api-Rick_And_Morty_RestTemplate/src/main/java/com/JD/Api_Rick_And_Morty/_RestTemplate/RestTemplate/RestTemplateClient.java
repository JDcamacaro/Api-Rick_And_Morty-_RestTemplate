package com.JD.Api_Rick_And_Morty._RestTemplate.RestTemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateClient {


    public String baseUrl = "https://rickandmortyapi.com/api" ;
    public String baseUrl1 = "https://rickandmortyapi.com/api/character/" ;


    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
