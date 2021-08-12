package com.example.jun.demo.calculator.controller;

import com.example.jun.demo.calculator.entity.User;
import com.example.jun.demo.calculator.service.UserService;
import com.example.jun.demo.calculator.service.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public final class UserController {
    private final UserService userService;

    @GetMapping("/all")
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("/name/{name}")
    public List<User> findAllByName(@PathVariable String name){
        return userService.findAllByName(name);
    }
    @GetMapping("/id/{id}")
    public Optional<User> findById(@PathVariable long id){
        return userService.findById(id);
    }
}
