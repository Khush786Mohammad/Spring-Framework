package com.spring.springcore.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/springcore/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String strQuery = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(strQuery, new Integer(1), "Khush", "Mohammad");
		System.out.println("Number of record" + result);
	}
}
