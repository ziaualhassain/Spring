package com.example.springbootApp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springbootApp2.services.Greetings;

@SpringBootApplication
public class SpringbootApp2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container =  SpringApplication.run(SpringbootApp2Application.class, args);
		Greetings greet = container.getBean(Greetings.class);
		System.out.println(greet.greetWish());
	}

}
