package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private String[] data = {
		"Beware of the wolf in sheep's clothing",
		"Diligence is the mother of good luck",
		"The journey is the reward"
	};
	
	Random random = new Random();
	public String getFortune() {
		int index = random.nextInt(data.length);	
		return data[index];
	}

}