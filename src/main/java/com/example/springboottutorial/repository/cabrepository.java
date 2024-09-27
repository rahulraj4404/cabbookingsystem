package com.example.springboottutorial.repository;

import com.example.springboottutorial.model.cab;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface cabrepository extends MongoRepository<cab, String> {
    cab findByEmail(String email);  // for cab login
    cab findFirstByStatus(String status);

}
