package com.example.jun.demo.calculator.repository;

import com.example.jun.demo.calculator.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {
    List<User> findAllByName(String name);
}
