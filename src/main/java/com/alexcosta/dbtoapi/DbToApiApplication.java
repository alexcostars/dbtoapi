package com.alexcosta.dbtoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.alexcosta.dbtoapi.models")
public class DbToApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbToApiApplication.class, args);
	}
}
