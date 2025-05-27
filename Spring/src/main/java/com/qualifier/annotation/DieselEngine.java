package com.qualifier.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dieselEngine")
public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel Engine started");
    }
}
