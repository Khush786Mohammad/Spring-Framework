package com.spring.springcore.springjavaconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.spring.springcore.springjavaconfig.dao.DaoConfig;
import com.spring.springcore.springjavaconfig.service.Service;

@Configuration
@ComponentScan("com.spring.springcore.springjavaconfig")
@Import(DaoConfig.class)
public class SpringConfig {

//	@Bean
//	@Scope("prototype")
//	public Dao dao() {
//		return new Dao();
//	}
	
	@Bean(initMethod = "start", destroyMethod = "destroy")
	public Service service() {
		return new Service();
	}
}
