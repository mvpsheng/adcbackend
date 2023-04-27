package com.example.adcbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.adcbackend.mapper")
public class AdcbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdcbackendApplication.class, args);
	}

}
