package com.example.first_spring_app.controller;

import com.example.first_spring_app.model.User;
import com.example.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    //public HelloWorldController(HelloWorldService helloWorldService){
    //    this.helloWorldService = helloWorldService;
    //}

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Icaro");
    }

    @PostMapping
    public String helloWorldPost(@RequestBody User body){
        return "Hello World Post";
    }
}
