package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	FortuneService fortuneService;
	@Value("${foo.name}")
	String name;
	@Value("${foo.email}")
	String email;
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public SwimCoach(FortuneService theFortunService) {
		this.fortuneService = theFortunService;
	}
	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
