package com.example.jun.demo.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {
    private @Id long userId;
    private String username;
    private String name;
    private String password;
    private String email;
    private Date regDate;


}
