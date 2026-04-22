package com.spring.springcore.revision1.constructorInjection;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Processor implements InitializingBean, DisposableBean {
	private int gen;
	private String name;

	public Processor(int gen, String name) {
		this.gen = gen;
		this.name = name;
	}

	public int getGen() {
		return gen;
	}

	public void setGen(int gen) {
		this.gen = gen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Processor [gen=" + gen + ", name=" + name + "]";
	}

	@Override
	public void afterPropertiesSet() {
		System.out.println("Processor Bean has been initialized");
	}

	@Override
	public void destroy() {
		System.out.println("Processor Bean is being destroyed");
	}
}
