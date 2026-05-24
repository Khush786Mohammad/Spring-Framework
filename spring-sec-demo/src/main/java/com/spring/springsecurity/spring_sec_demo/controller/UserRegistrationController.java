package com.spring.springsecurity.spring_sec_demo.controller;

import com.spring.springsecurity.spring_sec_demo.entity.User;
import com.spring.springsecurity.spring_sec_demo.service.JwtService;
import com.spring.springsecurity.spring_sec_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class UserRegistrationController {

    @Autowired
    private UserService service;

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private JwtService jwtService;

    @PostMapping(value = "/register", consumes = "application/json")
    public User register(@RequestBody User user) {
        return this.service.saveUser(user);
    }

    @PostMapping(value = "/login", consumes = "application/json")
    public String login(@RequestBody User user) {
        Authentication authentication = manager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if (authentication.isAuthenticated())
            return jwtService.generateToken(user.getUsername());
        return "Failure";
    }
}
