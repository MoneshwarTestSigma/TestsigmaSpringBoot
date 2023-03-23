package com.security.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {
//Refer application.properties for user id and password
	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

}
