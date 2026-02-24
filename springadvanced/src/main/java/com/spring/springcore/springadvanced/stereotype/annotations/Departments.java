package com.spring.springcore.springadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Departments {
	@Value("101")
	private int depId;
	@Value("School of Computing")
	private String depName;
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	@Override
	public String toString() {
		return "Departments [depId=" + depId + ", depName=" + depName + "]";
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
}
