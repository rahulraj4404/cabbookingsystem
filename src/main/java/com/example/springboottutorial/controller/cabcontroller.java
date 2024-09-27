package com.example.springboottutorial.controller;

import com.example.springboottutorial.model.cab;
import com.example.springboottutorial.service.cabservice;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cabs")
public class cabcontroller {

    @Autowired
    private cabservice cabserv;
    @PostMapping("/register")
    public ResponseEntity<cab> addcab(@RequestBody cab c) {
        return ResponseEntity.ok(cabserv.registercab(c));
    }
    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestBody cab c) {
            cab cabloginornot=cabserv.logincab(c.getEmail(),c.getPassword());
            if(cabloginornot!=null) {
                return ResponseEntity.ok("loggedin successfully");
            }
            else {
                return ResponseEntity.ok("invalid credentials");
            }
    }
}
