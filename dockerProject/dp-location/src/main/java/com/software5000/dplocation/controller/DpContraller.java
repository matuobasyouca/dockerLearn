package com.software5000.dplocation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
public class DpContraller {


    @GetMapping(value = "/main/getL")
    public String getTlp(){
        String[] locations = {
                "beijing",
                "tianjin",
                "yangzhou",
                "shanghai",
        };
        return locations[new Random().nextInt(4)];
    }
}
