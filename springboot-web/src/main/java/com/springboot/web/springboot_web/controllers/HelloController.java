package com.springboot.web.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class HelloController {
	
	@GetMapping(value = "/hello")
	public String hello(@RequestParam String username) {
		return "Hello " + username;
	}
}
