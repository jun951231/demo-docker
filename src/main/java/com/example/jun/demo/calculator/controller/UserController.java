package com.example.jun.demo.calculator.controller;

import com.example.jun.demo.calculator.entity.User;
import com.example.jun.demo.calculator.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public final class UserController {
    private final UserServiceImpl userService;

    @GetMapping("/users/all")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/users/name/{name}")
    public List<User> findByName(@PathVariable String name){
        return userService.findAllByName(name);
    }
}
