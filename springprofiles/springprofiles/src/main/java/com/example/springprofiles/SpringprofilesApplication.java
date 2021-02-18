package com.example.springprofiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
public class SpringprofilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringprofilesApplication.class, args);
	}

}
