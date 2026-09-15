package com.example.first_spring_app.service;

import com.example.first_spring_app.model.User;
import com.example.first_spring_app.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> listarUser(){
        return userRepository.findAll();
    }

    public User criarUsuario (User usuario){
        return userRepository.save(usuario);
    }
}
