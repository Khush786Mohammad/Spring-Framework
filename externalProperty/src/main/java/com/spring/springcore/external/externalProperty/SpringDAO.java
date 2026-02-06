package com.spring.springcore.external.externalProperty;

public class SpringDAO {
	private String dbServer;
	SpringDAO(String dbServer){
		this.dbServer = dbServer;
	}
	
	@Override
	public String toString() {
		return "SpringDAO" + "[dbServer=" + dbServer + "]";
	}
}
