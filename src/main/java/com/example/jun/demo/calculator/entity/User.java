package com.example.jun.demo.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class User {
    @Id
    private String userid;
    private String name;
    private String email;
    private String password;

    @Override
    public String toString(){
        return "회원명세{" +
                "아이디='" + userid + '\'' +
                ", 이름='" + name + '\'' +
                ", 이메일='" + email + '\'' +
                ", 비밀번호='" + password + '\'' +
                '}';
    }

}
