package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {

	public static void main(String[] args) {
		//load the config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve the bean from Spring Container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		//check if they are same
		boolean result = (theCoach == alphaCoach);
		//print some results
		System.out.println("Pointing to the same object: " + result);
		System.out.println("Memory Loaction for theCoach: " + theCoach);
		System.out.println("Memory Loaction for alphaCoach: " + alphaCoach);
		//Close the Context
		context.close();
		
	}

}
