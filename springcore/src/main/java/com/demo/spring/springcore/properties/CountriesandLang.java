package com.demo.spring.springcore.properties;

import java.util.Properties;

public class CountriesandLang {
	private Properties countryAndLang;
	
	public Properties getCountryAndLang() {
		return countryAndLang;
	}

	public void setCountryAndLang(Properties countryAndLang) {
		this.countryAndLang = countryAndLang;
	}

	@Override
	public String toString() {
		return "CountriesandLang [countryAndLang=" + countryAndLang + "]";
	}
}
