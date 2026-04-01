package com.spring.springcore.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.springcore.springmvc.controller.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView mView = new ModelAndView();
		mView.setViewName("displayObject");
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("Khush");
		employee.setSalary(25000);
		mView.addObject("employee", employee);
		return mView;
	}
}
