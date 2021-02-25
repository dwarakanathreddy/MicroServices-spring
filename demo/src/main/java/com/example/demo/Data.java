package com.example.demo;

import java.util.List;
import java.util.Map;

public class Data {


    public List<Map<String, String>> getPosts() {
        return posts;
    }

    public void setPosts(List<Map<String, String>> posts) {
        this.posts = posts;
    }

    private List<Map<String, String>> posts;


}
