package com.example.modularArchitecture.notification.controller;

import com.example.modularArchitecture.auth.dto.AuthResponse;
import com.example.modularArchitecture.auth.entity.AuthEntity;
import com.example.modularArchitecture.auth.service.AuthService;
import com.example.modularArchitecture.notification.dto.NotificationResponse;
import com.example.modularArchitecture.notification.entity.NotificationEntity;
import com.example.modularArchitecture.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @GetMapping("/notification")
    public NotificationResponse getAuth(@RequestBody NotificationEntity notificationEntity) {
        return notificationService.getNotification(notificationEntity);
    }
}
