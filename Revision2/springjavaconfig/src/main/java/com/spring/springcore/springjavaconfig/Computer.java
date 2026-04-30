package com.spring.springcore.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Computer {
	private String name;
	
	@Autowired(required = true)
	@Qualifier("processor2")
	private Processor processor;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", processor=" + processor + "]";
	}
}
