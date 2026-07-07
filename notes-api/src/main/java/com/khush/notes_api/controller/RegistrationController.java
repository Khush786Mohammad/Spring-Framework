package com.khush.notes_api.controller;

import com.khush.notes_api.entity.User;
import com.khush.notes_api.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class RegistrationController {
    @Autowired
    private UserService service;

    @GetMapping("/hello")
    public String sayHello(HttpServletRequest request) {
        return "Hello your JSESSION ID IS: " + request.getSession().getId();
    }

    @PostMapping("/hello")
    public String getSessionId(HttpServletRequest request) {
        return "Your JESSION ID IS: " + request.getSession().getId();
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@Valid @RequestBody User user) {
        User user1 = this.service.registerUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
}
