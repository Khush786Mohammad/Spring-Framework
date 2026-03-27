package com.spring.springcore.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.springcore.springjdbc.employee.dao.EmployeeDAO;
import com.spring.springcore.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.spring.springcore.springjdbc.employee.entity.Employee;

@Component()
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
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

	@Override
	public int update(Employee emp) {
		String strQuery = "update employee set firstname=?, lastname=? where id=?";
		return jdbcTemplate.update(strQuery, emp.getFirstname(), emp.getLastname(), emp.getId());
	}

	@Override
	public int delete(int empId) {
		String strQuery = "delete from employee as emp where emp.id = ?";
		return jdbcTemplate.update(strQuery, empId);
	}

	@Override
	public Employee read(int empId) {
		String strQuery = "Select * from employee where id=?";
		EmployeeRowMapper empRowMapper = new EmployeeRowMapper();
		return jdbcTemplate.queryForObject(strQuery, empRowMapper, empId);
	}

	@Override
	public List<Employee> readAll() {
		String query = "Select * from employee";
		EmployeeRowMapper empRowMap = new EmployeeRowMapper();
		return jdbcTemplate.query(query, empRowMap);
	}

}
