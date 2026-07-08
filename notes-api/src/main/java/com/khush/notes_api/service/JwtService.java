package com.khush.notes_api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class JwtService {
    @Value("${spring.security.jwt.secretkey}")
    private static String SECRET_KEY;
    @Value("${spring.security.jwt.expiration_time}")
    private static Long EXPIRATION_TIME;

    public String generateToken(String username) {
        Map<String, Object> claims = new HashMap<String, Object>();
        return "111";
    }
}
