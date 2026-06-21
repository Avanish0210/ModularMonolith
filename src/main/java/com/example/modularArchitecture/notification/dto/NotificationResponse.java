package com.example.modularArchitecture.notification.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationResponse {
    private String username;
    private String message;
}
