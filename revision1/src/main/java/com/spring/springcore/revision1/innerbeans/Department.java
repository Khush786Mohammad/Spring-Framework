package com.spring.springcore.revision1.innerbeans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class Department {
	private int deptId;
	private String deptName;

	public int getDeptId() {
		return deptId;
	}

	@Required
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	@PostConstruct
	public void startBean() {
		System.out.println("Department Bean is initialized");
	}
	
	@PreDestroy
	public void destroyedBean() {
		System.out.println("Department Bean is destroyed");
	}
}