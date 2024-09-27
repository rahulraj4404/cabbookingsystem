package com.example.springboottutorial.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class user {

    private String username;
    private long phoneno;
    private String email;
    private String password;
}
