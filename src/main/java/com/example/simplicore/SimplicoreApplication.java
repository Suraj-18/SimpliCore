package com.example.simplicore;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SimplicoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplicoreApplication.class, args);
		log.info("Application Started");
	}

}
