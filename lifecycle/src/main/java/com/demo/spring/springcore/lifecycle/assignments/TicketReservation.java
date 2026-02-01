package com.demo.spring.springcore.lifecycle.assignments;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "TicketReservation [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println("Initializing after bean creation");
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("Destroy Method is called for ticket reservation");
	}
}
