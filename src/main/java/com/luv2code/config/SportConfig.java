package com.luv2code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.luv2code.springdemo.Coach;
import com.luv2code.springdemo.FortuneService;
import com.luv2code.springdemo.SadFortuneService;
import com.luv2code.springdemo.SwimCoach;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
	//define bean for Sad Fortune Service
	   @Bean
		public static PropertySourcesPlaceholderConfigurer
	                    propertySourcesPlaceHolderConfigurer() {
	        
	        return new PropertySourcesPlaceholderConfigurer();
	    }
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	//define bean for SwimCoach and inject the dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
