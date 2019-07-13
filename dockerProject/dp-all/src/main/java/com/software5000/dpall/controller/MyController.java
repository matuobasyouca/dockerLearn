package com.software5000.dpall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(value = "/main/showme")
    public String showMe(){
        return "love U! more";
    }
}
