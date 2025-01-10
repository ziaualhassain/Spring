package main;

import services.*;

public class LaunchApp {
	
	public static void main(String args[]) {
		
		// TshapedSkills  t = new TshapedSkills(); //-> Target Object {Services of another classes are used)
		
		//JavaCourse j = new JavaCourse(); //-> Depended object {Such objects whose services will be used by Target Object(Tshpaed using 2 classes java and spring) }
	
		//t.setCourse(new SpringBootCourse()); //-> Dependency Injection {Injecting depended object in target class is called Dependency Injection}
		
		//t.setCourse(new JavaCourse()); //-> Injecting dependent object via setter is called Setter injection.
		
		TshapedSkills  t = new TshapedSkills(new SpringBootCourse()); //-> Constructor injection
		
		Boolean status = t.buyTheCourse(499.99);
		if(status) {
			System.out.println("sucess");
		}else {
			System.out.println("failed");
		}
	}

}

//Here we ourselfs are creating the objects of main method and dependent objects but in spiring we don't event have to do it.
//in the pov main and Tshaped are tightly coupled
//but java and spring are loosely coupled
//we will give invert all these controls to spring framework such as object creation, dependency injection etc...