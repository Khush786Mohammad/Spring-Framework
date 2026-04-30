package com.spring.springcore.SpringJDBCeX.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.springcore.SpringJDBCeX.entity.Student;

public class StudentMapper implements RowMapper<Student> {
	@Override
	public Student mapRow(ResultSet rs, int rowNum)throws SQLException {
		Student student = new Student();
		student.setRollNo(rs.getInt("rollno"));
		student.setName(rs.getString("name"));
		student.setMarks(rs.getInt("marks"));
		return student;
	}
}
