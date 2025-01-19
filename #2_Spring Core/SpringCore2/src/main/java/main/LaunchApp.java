package main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import Services.TshapedSkills;

public class LaunchApp {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory container = new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader read = new XmlBeanDefinitionReader(container);
		
		read.loadBeanDefinitions("applicationconfig.xml");
		
		TshapedSkills t = container.getBean(TshapedSkills.class); //get the bean from container.
		
		Boolean status = t.buyTheCourse(454.4);
		
		
		if(status) {
			System.out.println("Course Purchased Sucessfully");
		}else{
			System.out.println("Course Purchased Failed");
		}
	}

}
