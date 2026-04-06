package com.spring.springcore.springmvcorm.user.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.springcore.springmvcorm.user.Service.UserService;
import com.spring.springcore.springmvcorm.user.entity.User;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/user-registration")
	public String showRegistrationPage() {
		return "userRegistration";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		ModelAndView mv = new ModelAndView();
		int result = userService.save(user);
		mv.addObject("result", result);
		mv.setViewName("successRegistration");
		return mv;
	}

	@RequestMapping("/get-userById")
	public ModelAndView getUser(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView();
		User resUser = userService.getUser(id);
		mv.addObject("user", resUser);
		mv.setViewName("singleUser");
		return mv;
	}
	
	@RequestMapping("getUsers")
	public String getAllUser(ModelMap modelMap) {
		List<User> users = userService.fetchAllUsers();
		modelMap.addAttribute("users",users);
		return "displayAllUsers";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
