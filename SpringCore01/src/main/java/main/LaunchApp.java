package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Services.TshapedSkills;

public class LaunchApp {

	public static void main(String[] args) {
		
		//Applicationcontexgt is a interface
		//classpathXmlAppplication is a implemntation class of ApplicationContext
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
		
		TshapedSkills t = container.getBean(TshapedSkills.class); //get the bean from container.
		
		Boolean status = t.buyTheCourse(454.4);
		
		
		if(status) {
			System.out.println("Course Purchased Sucessfully");
		}else{
			System.out.println("Course Purchased Failed");
		}
	}

}
