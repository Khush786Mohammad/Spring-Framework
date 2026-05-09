package com.spring.springcore.springmvcEx.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.springcore.springmvcEx.Dao.StudentDao;
import com.spring.springcore.springmvcEx.entity.Student;

@Repository("studentImpl")
public class StudentDaoImpl implements StudentDao{
	
	@Autowired(required = true)
	private HibernateTemplate hibernateTemplate;

	@Override
	@Transactional("tnxManager")
	public void save(Student s1) {
		System.out.println("Save method is called");
		hibernateTemplate.save(s1);
	}

	@Override
	@Transactional("tnxManager")
	public void update(Student s1) {
		hibernateTemplate.update(s1);
	}

	@Override
	@Transactional("tnxManager")
	public void deleteStudent(Student student) {
		System.out.println("Deleted method");
		hibernateTemplate.delete(student);
	}
	
	@Override
	public Student findStudent(int id) {
		Student student = hibernateTemplate.get(Student.class, id);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students= hibernateTemplate.loadAll(Student.class);
		return students;
	}
}
