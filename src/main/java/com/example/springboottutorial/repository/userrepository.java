package com.example.springboottutorial.repository;

import com.example.springboottutorial.model.user;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface userrepository extends MongoRepository<user, String> {
    user findByEmail(String email);
}
