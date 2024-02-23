package com.example.demosecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomePageController {
    
    @GetMapping("/")
    public String homePage() {
        return "Welcome to our home page";
    }

}
