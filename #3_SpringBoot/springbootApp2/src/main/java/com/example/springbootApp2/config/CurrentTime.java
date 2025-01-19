package com.example.springbootApp2.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurrentTime {
	
	public CurrentTime() {
		System.out.println("CurrentTime bean Created");
	}
	
	@Bean
	public LocalTime getTime() {
		return LocalTime.now();
	}

}
