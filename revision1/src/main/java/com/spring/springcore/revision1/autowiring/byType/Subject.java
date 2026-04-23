package com.spring.springcore.revision1.autowiring.byType;

public class Subject {
	private int subjectId;
	private String subjectName;

	public Subject(int id, String name) {
		this.subjectId = id;
		this.subjectName = name;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}

}
