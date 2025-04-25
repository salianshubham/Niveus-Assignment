package com.example.Assignment1.controller;


import com.example.Assignment1.services.ServicesTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ControllerTest {

    @Autowired
    ServicesTest servicesTest;

    @GetMapping
    public String test(){
        return servicesTest.test();
    }
}
