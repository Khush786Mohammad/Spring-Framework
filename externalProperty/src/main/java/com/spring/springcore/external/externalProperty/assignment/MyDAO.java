package com.spring.springcore.external.externalProperty.assignment;

public class MyDAO {
	private String wsclient;

	public MyDAO(String wsclient) {
		this.wsclient = wsclient;
	}

	@Override
	public String toString() {
		return "MyDAO [wsclient=" + wsclient + "]";
	}
}
