package com.example.springbootApp3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.springbootApp2.SpringbootApp2Application;
import com.example.springbootApp3.services.TshapedSkills;

@SpringBootApplication
public class SpringbootApp3Application {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext container =  SpringApplication.run(SpringbootApp3Application.class, args);
		TshapedSkills ts = container.getBean(TshapedSkills.class);
		Boolean status = ts.buyTheCourse(345.66);
		if(status) {
			System.out.println("Sucessfully purchased coursee");
		}else {
			System.out.println("Filed to purchased coursee");
		}
	}

}
