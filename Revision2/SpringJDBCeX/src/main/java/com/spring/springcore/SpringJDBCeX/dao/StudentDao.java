package com.spring.springcore.SpringJDBCeX.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.springcore.SpringJDBCeX.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int save(Student s1) {
		System.out.println("Save");
		String query = "insert into student (rollno, name, marks) values (?,?,?)";
		return jdbcTemplate.update(query,s1.getRollNo(), s1.getName(), s1.getMarks());
	}
	
	RowMapper<Student> mapper = (ResultSet rs, int rowNum) -> {
		Student student = new Student();
		student.setRollNo(rs.getInt("rollno"));
		student.setName(rs.getString("name"));
		student.setMarks(rs.getInt("marks"));
		return student;
	};
	
	public Student findById(int id) {
		String query = "select * from student where rollno = ?";
		return jdbcTemplate.queryForObject(query, mapper, id);
	}

	public List<Student> findAll() {
		String query = "select * from student";
		return jdbcTemplate.query(query,mapper);
	}
}
