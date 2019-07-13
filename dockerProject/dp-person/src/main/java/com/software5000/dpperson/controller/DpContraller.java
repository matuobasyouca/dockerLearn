package com.software5000.dpperson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DpContraller {



    @GetMapping(value = "/main/getLp")
    public String getTlp(){
        String[] persons = {
                "simo",
                "eva",
                "glen",
                "laug",
        };
        return persons[new Random().nextInt(4)];
    }
}
