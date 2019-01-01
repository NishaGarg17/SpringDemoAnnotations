package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	@Value("${foo.name}")
	private String name;
	@Value("${foo.email}")
	private String email;
	
	@Autowired
	//@Qualifier("happyFortuneService")
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
/*	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	public TennisCoach() {
		System.out.println(">> Inside Default Constructor");

	}
/*	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> Inside Setter Method setFortuneService");
		fortuneService = theFortuneService;
	}*/
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}
	//define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanUpStuff()");
	}
	public String getDailyWorkout() {
		System.out.println("Name is: " + name);
		System.out.println("Email is: " + email);
		return "Practice your backhand volley";
		
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
