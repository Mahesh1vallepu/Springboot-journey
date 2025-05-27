package com.qualifier.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.security.PublicKey;

@Component
public class Car {

    private Engine engine;

    @Autowired
    public Car(@Qualifier("dieselEngine") Engine engine){
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("car is driving with");
    }
}
