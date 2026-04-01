package com.spring.springcore.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.springcore.springmvc.controller.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView mView = new ModelAndView();
		mView.setViewName("displayList");
		Employee employee1 = new Employee();
		employee1.setId(123);
		employee1.setName("Khush");
		employee1.setSalary(25000);
		
		Employee employee2 = new Employee();
		employee2.setId(124);
		employee2.setName("Mohammad");
		employee2.setSalary(26000);
		
		Employee employee3 = new Employee();
		employee3.setId(123);
		employee3.setName("Happ");
		employee3.setSalary(24000);
		
		ArrayList<Employee> empsArrayList = new ArrayList<Employee>();
		empsArrayList.add(employee1);
		empsArrayList.add(employee2);
		empsArrayList.add(employee3);
		mView.addObject("employeeList", empsArrayList);
		return mView;
	}
}
