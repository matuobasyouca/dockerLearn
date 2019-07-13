package com.software5000.dplocation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DpLocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DpLocationApplication.class, args);
	}

}
