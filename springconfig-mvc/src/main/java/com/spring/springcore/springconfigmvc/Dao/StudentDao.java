package com.spring.springcore.springconfigmvc.Dao;

import java.util.List;

import com.spring.springcore.springconfigmvc.entity.Student;

public interface StudentDao {
	public void save(Student s1);
	
	public void update(Student s1);
	
	public void deleteStudent(Student s1);
	
	public Student findStudent(int id);
	
	public List<Student> getAllStudents();
}
