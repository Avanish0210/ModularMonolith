package com.example.modularArchitecture.notification.repository;

import com.example.modularArchitecture.auth.entity.AuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<AuthEntity,Long> {
}
