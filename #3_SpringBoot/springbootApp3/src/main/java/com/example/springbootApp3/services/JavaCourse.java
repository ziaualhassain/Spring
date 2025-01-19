package com.example.springbootApp3.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class JavaCourse implements Icourse {
	
	public JavaCourse() {
		System.out.println("Java Bean created");
	}

	@Override
	public Boolean getTheCourse(Double price) {
		
		System.out.println("Java Course purchased sucessfully and the fees apid is : "+price);
		
		return true;
	}

}
