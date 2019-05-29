package com.stackroute.springeurekaclienttrackservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringEurekaClientTrackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientTrackServiceApplication.class, args);
	}

}
