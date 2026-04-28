package com.spring.springcore.revision1.multpleBeanError;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pro")
public class Processor {
	@Value("M2 Chip")
	private String name;
	@Value("2")
	private int gen;
	@Value("Mac")
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGen() {
		return gen;
	}

	public void setGen(int gen) {
		this.gen = gen;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Processor [name=" + name + ", gen=" + gen + ", type=" + type + "]";
	}
}