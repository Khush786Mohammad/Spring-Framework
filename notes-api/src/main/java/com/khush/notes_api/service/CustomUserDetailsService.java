package com.khush.notes_api.service;

import com.khush.notes_api.entity.User;
import com.khush.notes_api.security.UserPrincipal;
import com.khush.notes_api.repository.UserRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(@NonNull String username) throws UsernameNotFoundException {
        User user = this.repository.findByUsername(username);
        if (user == null)
            throw new UsernameNotFoundException("Username not found");
        return new UserPrincipal(user);
    }

    @Autowired
    public CustomUserDetailsService(UserRepository repo) {
        this.repository = repo;
    }
}
