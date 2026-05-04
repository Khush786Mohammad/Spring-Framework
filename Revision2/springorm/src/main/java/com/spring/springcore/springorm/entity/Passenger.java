package com.spring.springcore.springorm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")

	private String lastname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Passenger [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

}
