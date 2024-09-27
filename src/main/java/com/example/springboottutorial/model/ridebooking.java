package com.example.springboottutorial.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "ridebooking")
public class ridebooking {

    private String username;
    private String source;
    private String destination;
    private int fare;
    private String status="pending";
    private String cabname;
    private String cabdrivername;
    private String cabno;



}
