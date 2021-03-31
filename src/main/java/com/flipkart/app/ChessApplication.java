package com.flipkart.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ChessApplication {


	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		SpringApplication.run(ChessApplication.class, args);
	}

}
