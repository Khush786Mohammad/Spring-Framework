package com.demo.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.springcore.list.Hospital;

import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/demo/spring/springcore/properties/propertiesconfig.xml");
		CountriesandLang cl = (CountriesandLang) ctx.getBean("countryNLang");
		System.out.println("Countries and Language: " +cl.getCountryAndLang());
	}

}
