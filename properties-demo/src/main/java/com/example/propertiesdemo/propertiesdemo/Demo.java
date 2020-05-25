package com.example.propertiesdemo.propertiesdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class Demo {

    @Value("${greeting.message}")
    private String message;
    @GetMapping("/greeting")
    public String greeting(){
        return message;
    }
}
