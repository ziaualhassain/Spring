package com.example.springbootApp3.services;

import org.springframework.stereotype.Service;

@Service
public class SpringBoot implements Icourse {
	
	public SpringBoot() {
		System.out.println("SpringBoot Bean created");
	}

	@Override
	public Boolean getTheCourse(Double price) {
		System.out.println("SpringBoot Course Purchased successfull and fees paid is "+price);
		return true;
	}

}
