package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.config.SportConfig;

public class JavaConfigDemoApp {
	public static void main(String[] args) {
		//Read the spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		// Close the context
		context.close();
	}
}
