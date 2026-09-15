package com.example.first_spring_app.repository;

import com.example.first_spring_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
