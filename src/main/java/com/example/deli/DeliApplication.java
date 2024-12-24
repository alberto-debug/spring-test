package com.example.deli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeliApplication {

	@GetMapping("/")
	public String Hello(){
		return("Hello world");
	}


	public static void main(String[] args) {
		SpringApplication.run(DeliApplication.class, args);
	}

}
