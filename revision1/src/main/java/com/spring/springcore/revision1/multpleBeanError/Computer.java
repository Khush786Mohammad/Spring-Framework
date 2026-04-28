package com.spring.springcore.revision1.multpleBeanError;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("com")

public class Computer {
	@Value("Macbook Air M2")
	private String name;
	@Autowired
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
