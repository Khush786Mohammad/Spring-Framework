package com.spring.springcore.springjdbc.employee.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springcore.springjdbc.employee.dao.EmployeeDAO;
import com.spring.springcore.springjdbc.employee.entity.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee emp) {
		String strQuery = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(strQuery, emp.getId(), emp.getFirstname(), emp.getLastname());
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
