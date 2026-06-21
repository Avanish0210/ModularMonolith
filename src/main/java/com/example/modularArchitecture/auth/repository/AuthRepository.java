package com.example.modularArchitecture.auth.repository;

import com.example.modularArchitecture.auth.entity.AuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<AuthEntity,Long> {
}
