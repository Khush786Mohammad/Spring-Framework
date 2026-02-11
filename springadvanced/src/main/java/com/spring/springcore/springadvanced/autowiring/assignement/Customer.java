package com.spring.springcore.springadvanced.autowiring.assignement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	private String name;
	
//	@Autowired
//	@Qualifier("reservation")
	private Reservation reservation;

	@Autowired
	public Customer(@Qualifier("reservation") Reservation reservation) {
		this.reservation = reservation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", reservation=" + reservation + "]";
	}

	public Reservation getReservation() {
		return reservation;
	}

//	@Autowired
//	@Qualifier("reservation")
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}
