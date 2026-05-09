package com.spring.springcore.springmvcEx.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.springcore.springmvcEx.entity.Student;

@Controller
public class StudentController {

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
		ModelAndView mView = new ModelAndView();
		mView.addObject("student", student);
		mView.setViewName("successRegistration");
		return mView;
	}

	@RequestMapping("/viewStudent")
	public ModelAndView viewStudentsPage() {
		ModelAndView mView = new ModelAndView();
		List<Student> students = new ArrayList<>();
		students.add(new Student(101, "Khush", "khush@gmail.com", "B.TECH"));
		students.add(new Student(102, "Aman", "aman@gmail.com", "Spring"));
		students.add(new Student(103, "Rahul", "rahul@gmail.com", "Hibernate"));

		mView.addObject("students",students);
		mView.setViewName("viewStudents");
		return mView;
	}
}
