package com.spring.springcore.revision1.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inv")
@Scope("prototype")
public class Inventory {
	@Value("12")
	private int id;
	@Value("500")
	private int capacity;
	@Value("#{employees}")
	private List<String> employee;

	public List<String> getEmployee() {
		return employee;
	}

	public void setEmployee(List<String> employee) {
		this.employee = employee;
	}

	private final Product product;

	public Inventory(Product product) {
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
	}

	public Product getProduct() {
		return product;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", capacity=" + capacity + ", employee=" + employee + ", product=" + product
				+ "]";
	}

}
