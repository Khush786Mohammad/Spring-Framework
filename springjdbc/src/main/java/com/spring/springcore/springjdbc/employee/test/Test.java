package com.spring.springcore.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.springcore.springjdbc.employee.dao.EmployeeDAO;
import com.spring.springcore.springjdbc.employee.entity.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/spring/springcore/springjdbc/employee/test/config.xml");
		EmployeeDAO employeeDAO = (EmployeeDAO) ctx.getBean("employeeDAOImpl");
		Employee emp1 = new Employee();

		emp1.setId(2);
		emp1.setFirstname("Bob");
		emp1.setLastname("Doe");
//		int result = employeeDAO.update(emp1);
//		System.out.println("Number of record" + result);
//		System.out.println("Number of record deleted" + employeeDAO.delete(2));
		System.out.println("Employee Record" + employeeDAO.read(1));
		List<Employee> employees = employeeDAO.readAll();
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
