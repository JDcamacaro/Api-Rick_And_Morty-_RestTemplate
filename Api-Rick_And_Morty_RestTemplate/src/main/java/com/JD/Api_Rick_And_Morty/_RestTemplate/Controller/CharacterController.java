package com.JD.Api_Rick_And_Morty._RestTemplate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class CharacterController {
    
    @Autowired
    RestTemplate restTemplate;


    @Value("${base-url}")
    private String baseUrl;
    @Value("${base-url1}")
    private String baseUrl1 ;


    @GetMapping("/test")
    public Object getApi(){
        //String url = "https://rickandmortyapi.com/api";
        String url = baseUrl;
        Object forObject = restTemplate.getForObject(url, Object.class);
        return forObject;
    }

/*     @GetMapping("/character/{id}")
    public Character getCharacterId(@PathVariable Long id){
        String url = "https://rickandmortyapi.com/api/character/"+ id;
        Character character = restTemplate.getForObject(url, Character.class);
        return character;
    } */

    
    @GetMapping("/character/{id}")
    public Object getCharacterById(@PathVariable Long id){
        String url = baseUrl1 + id;
        //String url = "https://rickandmortyapi.com/api/character/"+ id;
        //ResponseEntity<?> response = restTemplate.getForEntity(url, Object.class);
        ResponseEntity<?> response = restTemplate.getForEntity(url, Object.class);
        return response;
    } 



    @GetMapping("/character/list")
    public Object getAllCharacter(){
        String url = baseUrl1;
        //String url = "https://rickandmortyapi.com/api/character";
        ResponseEntity<?> response = restTemplate.getForEntity(url, Object.class);
        return response.getBody();
    }
}
