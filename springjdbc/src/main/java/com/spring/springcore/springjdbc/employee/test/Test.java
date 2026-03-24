package com.spring.springcore.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springcore.springjdbc.employee.dao.EmployeeDAO;
import com.spring.springcore.springjdbc.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/springcore/springjdbc/employee/test/config.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) ctx.getBean("employeeDAO");
		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.setFirstname("John");
		emp1.setLastname("Doe");
		int result = employeeDAO.create(emp1);
		System.out.println("Number of record" + result);
	}
}
