package com.example.modularArchitecture.notification.service;

import com.example.modularArchitecture.auth.dto.AuthResponse;
import com.example.modularArchitecture.auth.entity.AuthEntity;
import com.example.modularArchitecture.notification.dto.NotificationResponse;
import com.example.modularArchitecture.notification.entity.NotificationEntity;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {


    public NotificationResponse getNotification(NotificationEntity notificationEntity) {
        return NotificationResponse.builder()
                .username(notificationEntity.getUsername())
                .message("New Notification Message")
                .build();
    }
}
