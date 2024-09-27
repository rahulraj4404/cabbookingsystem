package com.example.springboottutorial.controller;

import com.example.springboottutorial.model.ridebooking;
import com.example.springboottutorial.service.ridebookingservice;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ridebooking")
public class ridecontroller {

    @Autowired
    private ridebookingservice ridebookingserv;

    @PostMapping("/bookride")
    public ResponseEntity<String> ridebook(@RequestBody ridebooking rbooking) {
        ridebooking rb=ridebookingserv.bookride(rbooking.getUsername(), rbooking.getSource(), rbooking.getDestination());
        if(rb!=null)
        {
            return ResponseEntity.ok("booked successfully");
        }
        else
            return ResponseEntity.ok("booking failed");
    }
}
