package com.khush.notes_api.controller;

import com.khush.notes_api.entity.User;
import com.khush.notes_api.service.JwtService;
import com.khush.notes_api.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class RegistrationController {
    @Autowired
    @Qualifier("userService")
    private UserService service;
    @Autowired
    @Qualifier("jwtService")
    private JwtService jwtService;
    @Autowired
    private AuthenticationManager authenticationManager;

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

    @PostMapping(value = "/login", consumes = "application/json")
    public ResponseEntity<Object> login(@RequestBody User user) {
        if (user.getUsername() == null || user.getUsername().trim().equalsIgnoreCase(""))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username cannot be empty");

        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if (authentication.isAuthenticated()) {
            String token = jwtService.generateToken(user.getUsername());
            return ResponseEntity.status(HttpStatus.OK).body(token);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Credentials");
    }
}
