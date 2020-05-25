package com.example.microservices.moviecatalogservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
    @Value("${api.key}")
    private String apiKey;



    @RequestMapping("/{userid}")
    public List<MovieCatalog> userid(@PathVariable("userid") String userid){
    //    RestTemplate restTemplate = new RestTemplate("https://api.themoviedb.org/3/movie/"+useid+"?api_key="+apiKey, MovieSummary.class);
        //restTemplate.getForObject(, Rating.class);
        MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+userid+"?api_key="+apiKey, MovieSummary.class);

        Rating getMovieRating = restTemplate.getForObject("http://rating-data-service/ratings/titanic", Rating.class);
        System.out.println(getMovieRating);
        System.out.println(movieSummary.getOverview());
        return Collections.singletonList(
                new MovieCatalog("titanic","this is movie about ship",5)
//                new MovieCatalog("war","this is movie about war",4)
        );
    }
}
