package com.gestion.GesttionBibiliothequeBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@SpringBootApplication
public class GesttionBibiliothequeBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(GesttionBibiliothequeBackApplication.class, args);
	}

}
