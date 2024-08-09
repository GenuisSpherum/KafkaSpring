package com.example.ProductMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ProductMicroserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductMicroserviceApplication.class, args);
	}
}
