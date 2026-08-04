package com.khush.notes_api.service;

import com.khush.notes_api.entity.User;
import com.khush.notes_api.security.UserPrincipal;
import com.khush.notes_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class AuthenticationService {
    private final AuthenticationManager authenticationManager;
    private final UserRepository repository;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    @Transactional
    public User registerUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return this.repository.save(user);
    }

    public Authentication isAuthenticatedUser(User user) {
        return authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
    }

    public User getLoggedInUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        assert authentication != null;
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        assert userPrincipal != null;
        User user = new User();
        user.setId(userPrincipal.getPkId());
        user.setUsername(userPrincipal.getUsername());
        user.setEmail(userPrincipal.getEmailAddress());
        return user;
    }

    @Autowired
    public AuthenticationService(UserRepository repo, AuthenticationManager authenticationManager) {
        this.repository = repo;
        this.authenticationManager = authenticationManager;
    }
}
