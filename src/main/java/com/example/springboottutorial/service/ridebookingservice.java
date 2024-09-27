package com.example.springboottutorial.service;

import com.example.springboottutorial.model.ridebooking;
import com.example.springboottutorial.model.cab;
import com.example.springboottutorial.repository.cabrepository;
import com.example.springboottutorial.repository.ridebookingrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ridebookingservice {
    @Autowired
    private ridebookingrepository ridebookingrepo;
    @Autowired
    private cabrepository cabrepo;



    private int calculatefare(String source,String destination)
    {
        return Math.abs(source.length()-destination.length()+100);
    }
    public ridebooking bookride(String username,String source,String destination)
    {
        cab c= (cab) cabrepo.findFirstByStatus("available");
        if(c!=null)
        {
            ridebooking booking=new ridebooking();
            booking.setUsername(username);
            booking.setSource(source);
            booking.setDestination(destination);
            booking.setFare(calculatefare(source,destination));
            booking.setStatus("confirmed");
            booking.setCabname(c.getCabname());
            booking.setCabdrivername(c.getCabdrivername());
            booking.setCabno(c.getCabno());
            c.setStatus("assigned");
            cabrepo.save(c);
            return ridebookingrepo.save(booking);
        }
        return null;
    }
}
