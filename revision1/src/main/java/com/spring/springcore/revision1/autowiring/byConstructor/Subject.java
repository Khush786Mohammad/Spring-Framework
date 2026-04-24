package com.spring.springcore.revision1.autowiring.byConstructor;

public class Subject {
	private int subjId;
	private String subjName;

	public int getSubjId() {
		return subjId;
	}

	public Subject(int subjId, String subjName) {
		this.subjId = subjId;
		this.subjName = subjName;
	}

	public void setSubjId(int subjId) {
		this.subjId = subjId;
	}

	public String getSubjName() {
		return subjName;
	}

	public void setSubjName(String subjName) {
		this.subjName = subjName;
	}

	@Override
	public String toString() {
		return "Subject [subjId=" + subjId + ", subjName=" + subjName + "]";
	}

}
