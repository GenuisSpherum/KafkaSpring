package com.example.EmailNotificationMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class EmailNotificationMicroserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmailNotificationMicroserviceApplication.class, args);
	}
}
