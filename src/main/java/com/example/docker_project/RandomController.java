package com.example.docker_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {

    @GetMapping("/")
    public String getGreeting(){
        return "Hello, World!";
    }
}
