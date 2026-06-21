package com.example.modularArchitecture.auth.controller;

import com.example.modularArchitecture.auth.dto.AuthResponse;
import com.example.modularArchitecture.auth.entity.AuthEntity;
import com.example.modularArchitecture.auth.service.AuthService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @GetMapping("/auth")
    public AuthResponse getAuth(@RequestBody AuthEntity authEntity) {
        return authService.getAuth(authEntity);
    }
}
