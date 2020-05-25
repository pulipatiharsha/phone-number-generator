package com.phonenumber.generate.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.phonenumber.generate")
public class PhoneNumberGeneratorApplication {


	public static void main(String[] args) {
		SpringApplication.run(PhoneNumberGeneratorApplication.class, args);
	}

}
