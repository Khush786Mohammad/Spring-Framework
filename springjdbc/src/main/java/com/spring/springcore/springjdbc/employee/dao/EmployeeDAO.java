package com.spring.springcore.springjdbc.employee.dao;

import com.spring.springcore.springjdbc.employee.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
	int create(Employee emp);

	int update(Employee emp);

	int delete(int empId);

	Employee read(int empId);
	
	List<Employee> readAll();
}
