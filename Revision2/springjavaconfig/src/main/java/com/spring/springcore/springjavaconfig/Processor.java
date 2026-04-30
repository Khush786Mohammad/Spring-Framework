package com.spring.springcore.springjavaconfig;

public class Processor {
	private String name;
	private int gen;
	private String type;
	
//	public Processor() {
//		System.out.println("Processor is initialized");
//	}

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