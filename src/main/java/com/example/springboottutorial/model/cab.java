package com.example.springboottutorial.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="cab")
public class cab    {

    private String drivername;
    private long phoneno;
    @Getter
    private String cabno;
    @Setter
    @Getter
    private String cabname;
    private String email;
    private String password;
    private String status="available";


    public String getCabdrivername()
    {
        return drivername;
    }
}
