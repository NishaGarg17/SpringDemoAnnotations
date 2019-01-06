package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.config.SportConfig;

public class SwimJavaConfigDemoApp {
	public static void main(String[] args) {
		//Read the spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getEmail());
		// Close the context
		context.close();
	}
}
