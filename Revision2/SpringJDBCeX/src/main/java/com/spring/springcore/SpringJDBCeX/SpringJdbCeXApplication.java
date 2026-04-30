package com.spring.springcore.SpringJDBCeX;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.springcore.SpringJDBCeX.entity.Student;
import com.spring.springcore.SpringJDBCeX.service.StudentService;

@SpringBootApplication
public class SpringJdbCeXApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbCeXApplication.class, args);
		Student s1 = new Student();
		s1.setRollNo(99);
		s1.setName("Honey");
		s1.setMarks(89);

		StudentService service = context.getBean(StudentService.class);
		int result = service.addStudent(s1);
		System.out.println("Rows affected: "+result);
		Student std = service.findStudent(102);
		System.out.println(std);
		List<Student> studentList = service.findAllStudents();
		System.out.println(studentList);
	}

}
