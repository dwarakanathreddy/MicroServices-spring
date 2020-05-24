package com.example.microservices.moviecatalogservice;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.moviecatalogservice.MovieCatalog;

//import javax.xml.catalog.Catalog;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {


    @RequestMapping("/{userid}")
    public List<MovieCatalog> userid(@PathVariable("userid") String userid){
        return Collections.singletonList(
                new MovieCatalog("titanic","this is movie about ship",5)
//                new MovieCatalog("war","this is movie about war",4)
        );
    }
}
