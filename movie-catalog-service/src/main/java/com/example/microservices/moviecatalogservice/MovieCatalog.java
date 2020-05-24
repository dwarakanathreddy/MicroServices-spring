package com.example.microservices.moviecatalogservice;

public class MovieCatalog {

    private String desc;
    private String movieName;
    private int rating;

    public MovieCatalog(String movieName, String desc, int rating){
        this.rating=rating;
        this.movieName=movieName;
        this.desc=desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
