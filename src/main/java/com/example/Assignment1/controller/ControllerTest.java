package com.example.Assignment1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ControllerTest {

    @GetMapping
    public String test(){
        return "Assignment 1 completed";
    }
}
