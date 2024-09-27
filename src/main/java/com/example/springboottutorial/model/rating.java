package com.example.springboottutorial.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "rating")
public class rating {

    private String cabno;
    private String suggestion;
    private int rating;

}
