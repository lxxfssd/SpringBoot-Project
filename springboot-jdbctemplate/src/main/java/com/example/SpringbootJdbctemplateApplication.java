package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.controller","com.example.service"})
@EnableAutoConfiguration
public class SpringbootJdbctemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbctemplateApplication.class, args);
	}
}
