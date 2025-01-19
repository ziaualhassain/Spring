package com.example.springbootApp2.services;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Greetings {
	
	//field injection
	@Autowired
	private LocalTime time;
	
	public Greetings() {
		System.out.println("Greetings bean created");
	}
	
	public String greetWish() {
		int hours = time.getHour();
		if(hours < 12) {
			return "Good Morning";
		}else if(hours < 16) {
			return "Good Afternoon";
		}else if(hours < 20) {
			return "Good Evening";
		}
		return "Good Night";
	}

}
