package com.spring.springcore.SpringJDBCeX.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springcore.SpringJDBCeX.dao.StudentDao;
import com.spring.springcore.SpringJDBCeX.entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;

	public int addStudent(Student s1) {
		return studentDao.save(s1);
	}
	
	public Student findStudent(int id) {
		return studentDao.findById(id);
	}
	
	public List<Student> findAllStudents(){
		return studentDao.findAll();
	}
}
