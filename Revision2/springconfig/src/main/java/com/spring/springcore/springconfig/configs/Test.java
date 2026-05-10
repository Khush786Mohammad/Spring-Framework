package com.spring.springcore.springconfig.configs;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcore.springconfig.Dao.StudentDao;
import com.spring.springcore.springconfig.DaoImpl.StudentDaoImpl;
import com.spring.springcore.springconfig.entity.Student;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/springcore/springconfig/configs/config.xml");

		Student student = (Student) context.getBean("student");
		System.out.println(student);
		StudentDao dao = (StudentDao) context.getBean("repository");
		dao.save(student);
		dao.update(student);
		context.close();
	}
}
