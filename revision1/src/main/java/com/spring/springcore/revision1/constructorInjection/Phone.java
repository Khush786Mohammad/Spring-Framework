package com.spring.springcore.revision1.constructorInjection;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Phone {
	private String iemi;
	private String name;
	private int waranty;
	private Processor processor;

	public Phone(String iemi, String name, int waranty, Processor processor) {
		this.iemi = iemi;
		this.name = name;
		this.waranty = waranty;
		this.processor = processor;
	}

	public String getIemi() {
		return iemi;
	}

	public void setIemi(String iemi) {
		this.iemi = iemi;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWaranty() {
		return waranty;
	}

	public void setWaranty(int waranty) {
		this.waranty = waranty;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Phone [iemi=" + iemi + ", name=" + name + ", waranty=" + waranty + ", processor=" + processor + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("Phone bean is initialized");
	}

	@PreDestroy
	public void destroyed() {
		System.out.println("Phone bean is about to destroy");
	}
}
