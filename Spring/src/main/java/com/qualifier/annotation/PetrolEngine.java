package com.qualifier.annotation;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine{
    public void start(){
        System.out.println("petrol engine started");
    }
}
