package com.example.first_spring_app.controller;

import com.example.first_spring_app.model.User;
import com.example.first_spring_app.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> listar(){
        return userService.listarUser();
    }

    @PostMapping
    public User criarUsuario(@RequestBody User usuario){
        return userService.criarUsuario(usuario);

    }
}
