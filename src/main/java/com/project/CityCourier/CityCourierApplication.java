package com.project.CityCourier;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.project.*")
@SpringBootApplication
public class CityCourierApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityCourierApplication.class, args);
	}
}
