package com.example.modularArchitecture.auth.service;

import com.example.modularArchitecture.auth.dto.AuthResponse;
import com.example.modularArchitecture.auth.entity.AuthEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public AuthResponse getAuth(AuthEntity authEntity) {
        return AuthResponse.builder()
                .username(authEntity.getUsername())
                .token("This is valid tokn")
                .build();
    }

}
