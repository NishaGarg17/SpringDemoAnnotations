package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneservice implements FortuneService {

	public String getFortune() {
		return "This is your Lucky Day!";
	}

}
