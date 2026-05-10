package com.spring.springcore.springconfig.DaoImpl;

import org.springframework.stereotype.Component;

import com.spring.springcore.springconfig.Dao.StudentDao;
import com.spring.springcore.springconfig.entity.Student;

@Component("repository")
public class StudentDaoImpl implements StudentDao {

	@Override
	public void save(Student s1) {
		System.out.println("Student with Id: " + s1.getId() + " save successfully");
	}

	@Override
	public void update(Student s1) {
		System.out.println("Student with Id: " + s1.getId() + " updated successfully");
	}

}
