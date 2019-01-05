package com.moon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.moon")
public class RealityApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealityApplication.class, args);
	}

}

