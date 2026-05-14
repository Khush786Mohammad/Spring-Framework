package com.spring.springsecurity.spring_sec_demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/")
public class HelloController {

	@GetMapping("/hello")
	public String sayHello(HttpServletRequest req) {
		return "hello your JSESSIONID is: " + req.getSession().getId();
	}

	@GetMapping("/user")
	public String hiKhush(HttpServletRequest req, HttpServletResponse res, @RequestParam("username") String username) {
		Cookie cookie = new Cookie("username", username);
		cookie.setMaxAge(60 * 60 * 1);
		Cookie cookie2 = new Cookie("password", "admin@123");
		cookie2.setMaxAge(60);
		res.addCookie(cookie);
		res.addCookie(cookie2);

		return "Khush Mohammad your JSESSIONID is: " + req.getSession().getId();
	}

	@GetMapping("/customLogin")
	public String login(HttpServletRequest req, HttpServletResponse res) {
		Cookie[] cookies = req.getCookies();

		if (cookies == null)
			return "No Cookies Found";

		String username = Arrays.stream(cookies)
				.filter(cookie -> cookie.getName().equalsIgnoreCase("username"))
				.map(Cookie::getValue)
				.findFirst()
				.orElse("Username cookie not found");
		
		String password = Arrays.stream(cookies)
				.filter(cookie -> cookie.getName().equalsIgnoreCase("password"))
				.map(Cookie::getValue)
				.findFirst()
				.orElse("Invalid Password");
				
		return username+ " " + password;
	}
}
