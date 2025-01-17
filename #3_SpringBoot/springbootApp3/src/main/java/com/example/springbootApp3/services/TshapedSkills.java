package com.example.springbootApp3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TshapedSkills {
	
	private Icourse course;
	
	public void setCourse(Icourse course) {
		System.out.println("setter injection");
		this.course = course;
	}
	
	@Autowired
	public TshapedSkills(@Qualifier("springBoot") Icourse course) {
		System.out.println("TshapedSkills Bean created");
		System.out.println("Constructor injection");
		this.course = course;
		
	}
	
	public TshapedSkills() {
		System.out.println("TshapedSkills Bean created");
	}
	
	public boolean buyTheCourse(Double amount) {
		
		return course.getTheCourse(amount);
	}

}
