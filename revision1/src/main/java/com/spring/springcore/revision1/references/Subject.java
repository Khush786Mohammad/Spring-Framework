package com.spring.springcore.revision1.references;

public class Subject {
	private int subjectId;
	private String name;

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
}
