package com.spring.springcore.springmvcEx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.springcore.springmvcEx.Dao.StudentDao;
import com.spring.springcore.springmvcEx.entity.Student;

@Controller
public class StudentController {
	
	@Autowired
	@Qualifier("studentImpl")
	private StudentDao studentDao;

	@RequestMapping({ "/", "/home" })
	public ModelAndView homePageView() {
		ModelAndView mView = new ModelAndView();
		mView.setViewName("homePage");
		return mView;
	}

	@RequestMapping("/add-student")
	public String addStudent() {
		return "addStudent";
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudentSuccess(@ModelAttribute("student") Student student) {
		studentDao.save(student);
		ModelAndView mView = new ModelAndView();
		mView.addObject("student", student);
		mView.setViewName("successRegistration");
		return mView;
	}

	@RequestMapping("/viewStudent")
	public ModelAndView viewStudentsPage() {
		ModelAndView mView = new ModelAndView();
		List<Student> students = studentDao.getAllStudents();
		
		mView.addObject("students",students);
		mView.setViewName("viewStudents");
		return mView;
	}
	
	@RequestMapping("/updateStudent/{studentId}")
	public ModelAndView updateStudent(@PathVariable("studentId") int studentId) {
		Student student = studentDao.findStudent(studentId);
		ModelAndView mView = new ModelAndView();
		mView.addObject("student", student);
		mView.setViewName("updateStudent");
		return mView;
	}
	
	@RequestMapping(value="/updateStudentProcess", method= RequestMethod.POST)
	public ModelAndView updateStudentSuccessPage(@ModelAttribute("student") Student student) {
		studentDao.update(student);
		ModelAndView mView = new ModelAndView();
		mView.addObject("student", student);
		mView.setViewName("successUpdation");
		return mView;
	}
	
	@RequestMapping("/deleteStudent/{studentId}")
	public ModelAndView deleteStudent(@PathVariable("studentId") int studentId ) {
		Student student = studentDao.findStudent(studentId);
		studentDao.deleteStudent(student);
		ModelAndView mView = new ModelAndView();
		mView.setViewName("deleteStudent");
		return mView;
	}
}
