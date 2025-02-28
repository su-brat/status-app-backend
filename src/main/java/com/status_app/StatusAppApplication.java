package com.status_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.status_app")
public class StatusAppApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StatusAppApplication.class, args);
	}

}
