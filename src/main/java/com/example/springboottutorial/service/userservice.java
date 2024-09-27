package com.example.springboottutorial.service;

import com.example.springboottutorial.model.user;
import com.example.springboottutorial.repository.userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userservice {

    @Autowired
    private userrepository userrepo;
    public user registeruser(user u)
    {
        return userrepo.save(u);
    }
    public user loginuser(String email,String password)
    {
        user userloggedin=(user)userrepo.findByEmail(email);
        if(userloggedin !=null && userloggedin.getPassword().equals(password)){
            return userloggedin;
        }
        return null;
    }
}
