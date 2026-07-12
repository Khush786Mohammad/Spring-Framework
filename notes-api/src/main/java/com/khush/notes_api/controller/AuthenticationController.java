package com.khush.notes_api.controller;

import com.khush.notes_api.entity.User;
import com.khush.notes_api.entity.UserPrincipal;
import com.khush.notes_api.service.AuthenticationService;
import com.khush.notes_api.service.JwtService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
    @Autowired
    @Qualifier("userService")
    private AuthenticationService authenticationService;

    @Autowired
    @Qualifier("jwtService")
    private JwtService jwtService;

    @GetMapping("/hello")
    public String sayHello(HttpServletRequest request) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Hello your JSESSION ID IS: " + request.getSession().getId() + "authentication: " + authentication;
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@Valid @RequestBody User user) {
        User newUser = this.authenticationService.registerUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @PostMapping(value = "/login", consumes = "application/json")
    public ResponseEntity<Object> login(@RequestBody User user) {
        logger.info("Inside the login method");
        if (user.getUsername() == null || user.getUsername().trim().equalsIgnoreCase(""))
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username cannot be empty");
        Authentication authentication = this.authenticationService.isAuthenticatedUser(user);

        if (authentication.isAuthenticated()) {
            UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
            assert userPrincipal != null;
            String token = jwtService.generateToken(userPrincipal);
            return ResponseEntity.status(HttpStatus.OK).body(token);
        }
        logger.info("At the end of login method");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Credentials");
    }
}
