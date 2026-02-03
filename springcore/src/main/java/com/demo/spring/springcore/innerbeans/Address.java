package com.demo.spring.springcore.innerbeans;

public class Address {
	private int houseno;
	private String street;
	private String city;
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", street=" + street + ", city=" + city + "]";
	}
	
	
}
