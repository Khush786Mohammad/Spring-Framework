package com.spring.springsecurity.spring_sec_demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springsecurity.spring_sec_demo.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	List<Student> students = new ArrayList<>(List.of(new Student(1, "John", "dc@gmail.com")));
	
	@GetMapping("/fetch-students")
	public List<Student> fetchStudents(){
		System.out.println("Student is fetched"+ this.students);
		return students;
	}
	
	@PostMapping("/add-student")
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}
}
