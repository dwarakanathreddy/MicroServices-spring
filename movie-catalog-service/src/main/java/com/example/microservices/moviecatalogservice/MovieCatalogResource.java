package com.example.microservices.moviecatalogservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.moviecatalogservice.MovieCatalog;
import org.springframework.web.client.RestTemplate;

//import javax.xml.catalog.Catalog;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userid}")
    public List<MovieCatalog> userid(@PathVariable("userid") String userid){
    //    RestTemplate restTemplate = new RestTemplate();
        Rating getMovieRating = restTemplate.getForObject("http://localhost:8082/ratings/titanic", Rating.class);
        System.out.println(getMovieRating);
        return Collections.singletonList(
                new MovieCatalog("titanic","this is movie about ship",5)
//                new MovieCatalog("war","this is movie about war",4)
        );
    }
}
