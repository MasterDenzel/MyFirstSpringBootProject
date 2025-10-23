package com.springframework.diexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiexampleApplication.class, args);
        System.out.print("Hello World 2");
        System.out.print("Hello World 3");
        System.out.print("Hello World 4");
	}
}

