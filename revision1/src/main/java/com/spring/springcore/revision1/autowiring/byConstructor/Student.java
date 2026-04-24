package com.spring.springcore.revision1.autowiring.byConstructor;

import java.util.Properties;

public class Student {
	private int stdId;
	private String stdName;
	private Properties props;
	private Subject subj;

	public Student(int id, String name, Subject subject) {
		this.stdId = id;
		this.stdName = name;
		this.subj = subject;
	}

	public Subject getSubj() {
		return subj;
	}

	public void setSubj(Subject subj) {
		this.subj = subj;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", props=" + props + ", subj=" + subj + "]";
	}

}
