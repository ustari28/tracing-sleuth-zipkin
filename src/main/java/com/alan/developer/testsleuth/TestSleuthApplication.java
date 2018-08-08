package com.alan.developer.testsleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TestSleuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSleuthApplication.class, args);
	}
}
