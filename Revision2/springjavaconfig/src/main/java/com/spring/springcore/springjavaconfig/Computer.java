package com.spring.springcore.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.annotation.PostConstruct;
public class Computer {
	private String name;

	private Processor processor;
	
	@PostConstruct
	public void start() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Processor getProcessor() {
		return processor;
	}

	@Autowired
	@Qualifier("processor2")
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", processor=" + processor + "]";
	}
}
