package com.example.ActiveMqq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.ActiveMqq.*")
public class ActiveMqqApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveMqqApplication.class, args);
	}

}
