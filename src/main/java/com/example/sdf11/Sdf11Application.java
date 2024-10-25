package com.example.sdf11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sdf11Application {

	public static void main(String[] args) {
		SpringApplication.run(Sdf11Application.class, args);
	}
public String sayHi(){
		return "Hi";
}
}
