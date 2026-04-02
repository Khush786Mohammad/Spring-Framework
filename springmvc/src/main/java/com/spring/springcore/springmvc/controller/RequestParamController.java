package com.spring.springcore.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {
	
	@RequestMapping(value="/showData")
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam(value="sal", required=false, defaultValue = "0") double salary) {
		ModelAndView mView = new ModelAndView();
		System.out.println(id + name + salary);
		mView.setViewName("userRegistration");
		return mView;
	}
}
