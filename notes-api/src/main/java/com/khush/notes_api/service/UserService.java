package com.khush.notes_api.service;

import com.khush.notes_api.entity.User;
import com.khush.notes_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    private final UserRepository repository;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    @Transactional
    public User registerUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return this.repository.save(user);
    }

    @Autowired
    public UserService(UserRepository repo) {
        this.repository = repo;
    }
}
