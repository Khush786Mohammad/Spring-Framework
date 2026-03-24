package com.spring.springcore.revision1.collections;

public class Companies {
	private String name;
	private double lpa;
	private String joiningDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Companies [name=" + name + ", lpa=" + lpa + ", joiningDate=" + joiningDate + "]";
	}

	public double getLpa() {
		return lpa;
	}

	public void setLpa(double lpa) {
		this.lpa = lpa;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

}
