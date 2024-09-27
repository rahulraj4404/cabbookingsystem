package com.example.springboottutorial.controller;

import com.example.springboottutorial.model.user;
import com.example.springboottutorial.service.userservice;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class usercontroller {

    @Autowired
    private userservice userserv;
    @PostMapping("/register")
    public ResponseEntity<user> register(@RequestBody user u) {
        return ResponseEntity.ok(userserv.registeruser(u));
    }

    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestBody user u) {
        user ulogin=userserv.loginuser(u.getEmail(),u.getPassword());
        if(ulogin!=null) {
            return ResponseEntity.ok("login successful");
        }
        else
        {
            return ResponseEntity.ok("login unsuccessful");
        }
    }
}
