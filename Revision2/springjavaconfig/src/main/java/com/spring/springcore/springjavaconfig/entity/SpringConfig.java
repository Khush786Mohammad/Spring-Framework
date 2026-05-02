package com.spring.springcore.springjavaconfig.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	
	//creating bean of subject
	

	
	@Bean(name = "automata", initMethod = "init", destroyMethod = "destroy")
	public Subject subject() {
		return new Subject();
	}
//	 creating a bean of service
	@Bean(name = "service")
	public Service service() {
		return new Service();
	}
	
	@Bean(name="dao")
	public Dao dao() {
		return new Dao();
	}
	
	@Bean(name="dsa", initMethod = "init", destroyMethod = "destroy")
	public Subject subject2() {
		return new Subject();
	}
	
	@Bean(name="student")
	public Student student() {
		return new Student();
	}
}