package com.spring.springcore.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean(name= {"bionic","appleChip"})
	@Scope("prototype")
	public Processor processor() {
		System.out.println("Processor bean is initialized");
		return new Processor();
	}
}
