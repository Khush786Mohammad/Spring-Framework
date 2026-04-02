package com.spring.springcore.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.springcore.springmvc.controller.dto.User;

@Controller
public class UserController {
	@RequestMapping("/user-registration")
	public String showRegistrationPage() {
		return "userRegistration";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("successRegistration");
		mv.addObject("user", user);
		System.out.println(user);
		return mv;
	}
}
