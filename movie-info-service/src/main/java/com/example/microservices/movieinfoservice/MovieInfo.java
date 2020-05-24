package com.example.microservices.movieinfoservice;

import com.example.microservices.movieinfoservice.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movieinfo")
public class MovieInfo {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieid){
        return new Movie("titanic",movieid);
    }
}
