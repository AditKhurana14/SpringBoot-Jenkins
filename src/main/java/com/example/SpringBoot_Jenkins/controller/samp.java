package com.example.SpringBoot_Jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class samp {

    @GetMapping("/hello")
    public String Hello(){
        return "Hello World";
    }
    @GetMapping("/helloaaaa")
    public String helloworld(){
        return "Hello World";
    }
}
