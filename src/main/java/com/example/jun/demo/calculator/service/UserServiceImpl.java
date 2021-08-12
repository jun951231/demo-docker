package com.example.jun.demo.calculator.service;

import com.example.jun.demo.calculator.entity.User;
import com.example.jun.demo.calculator.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public List<User> findAllByName(String name){
        return userRepository.findAllByName(name);
    }
}