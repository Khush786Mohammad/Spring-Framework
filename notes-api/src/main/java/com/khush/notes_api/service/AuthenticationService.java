package com.khush.notes_api.service;

import com.khush.notes_api.entity.User;
import com.khush.notes_api.repository.UserRepository;
import com.khush.notes_api.security.UserPrincipal;
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
    public User registerUser(final User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return this.repository.save(user);
    }

    public Authentication isAuthenticatedUser(final User user) {
        return authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
    }

    public User getLoggedInUser() {
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        assert authentication != null;
        final UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();
        assert userPrincipal != null;
        User user = new User();
        user.setId(userPrincipal.getPkId());
        user.setUsername(userPrincipal.getUsername());
        user.setEmail(userPrincipal.getEmailAddress());
        return user;
    }

    @Autowired
    public AuthenticationService(final UserRepository repo, final AuthenticationManager authenticationManager) {
        this.repository = repo;
        this.authenticationManager = authenticationManager;
    }
}
