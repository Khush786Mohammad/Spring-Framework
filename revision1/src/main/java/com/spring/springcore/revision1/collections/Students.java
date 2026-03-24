package com.spring.springcore.revision1.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.security.auth.Subject;

public class Students {
	private int id;
	private String name;
	private List<String> subjectList;
	private Map<String, String> assets;
	private Properties loginCreds;
	private Companies companies;

	public Properties getLoginCreds() {
		return loginCreds;
	}

	public void setLoginCreds(Properties loginCreds) {
		this.loginCreds = loginCreds;
	}

	public Map<String, String> getAssets() {
		return assets;
	}

	public Companies getCompanies() {
		return companies;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", subjectList=" + subjectList + ", assets=" + assets
				+ ", loginCreds=" + loginCreds + ", companies=" + companies + "]";
	}

	public void setCompanies(Companies companies) {
		this.companies = companies;
	}

	public void setAssets(Map<String, String> assets) {
		this.assets = assets;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<String> subjectList) {
		this.subjectList = subjectList;
	}
}