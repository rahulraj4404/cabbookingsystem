package com.example.springboottutorial.service;

import com.example.springboottutorial.model.cab;
import com.example.springboottutorial.repository.cabrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class cabservice {
        @Autowired
        private cabrepository cabrepo;
        public cab registercab(cab c)
        {
            return cabrepo.save(c);
        }

        public cab logincab(String email,String password)
        {
            cab c = (cab)cabrepo.findByEmail(email);
            if(c!=null && c.getPassword().equals(password))
            {
                return c;
            }
            return null;
        }
}
