package com.example.springboottutorial.repository;

import com.example.springboottutorial.model.ridebooking;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface ridebookingrepository extends MongoRepository<ridebooking, String> {

}
