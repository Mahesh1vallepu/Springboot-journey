package com.example.firstSpringApi;

import org.springframework.stereotype.Service;

@Service
public class HelloResponse {
    private String message;

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
