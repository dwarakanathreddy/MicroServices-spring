package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/datadog")
public class DataDog {

    @RequestMapping("/dida")
    public String didaDog(){

        final String uri = "http://dummy.restapiexample.com/api/v1/employees";
//        final String url = "https://my-json-server.typicode.com/typicode/demo/posts";
        final String url = "https://gorest.co.in/public-api/users";
//        RestTemplate restTemplate = new RestTemplate();
//        Employee result = restTemplate.getForObject(uri, Employee.class);
//
//        System.out.println(result);
//        System.out.println(result.getClass());
//        System.out.println(result.getStatus());
//        System.out.println(result.getData());
//        System.out.println(result.getData().get(0).get("id"));

        RestTemplate restTemplate = new RestTemplate();
        Users data = restTemplate.getForObject(url, Users.class);
        System.out.println(data);
        System.out.println(data.getCode());
        System.out.println(data.getData().get(0));
        return "hello";

    }
}
