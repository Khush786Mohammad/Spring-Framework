package com.spring.springcore.revision1.constructorInjection.ambiguity;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(String name, String id) {
		System.out.println("Name first: " + name + id);
	}

	public Employee(int id, String name) {
		System.out.println("Id first " + id + name);
	}

	public Employee(int id, String name, double salary) {
		System.out.println("Integer id");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee(String id, String name, double salary) {
		System.out.println("String id");
		this.id = Integer.parseInt(id);
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
