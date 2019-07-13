package com.software5000.dptime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
public class DpContraller {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 实例化RestTemplate
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate rest() {
        return new RestTemplate();
    }

    @GetMapping(value = "/main/getTlp")
    public String getTlp(){
        return new Date().toString()+this.restTemplate.getForObject("http://dp-person/main/getLp",String.class);
    }

    @GetMapping(value = "/gotoUser")
    @ResponseBody
    public String getTest(){
        return "test";
    }
}
