package com.maid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SocietyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocietyServiceApplication.class, args);
	}

}
