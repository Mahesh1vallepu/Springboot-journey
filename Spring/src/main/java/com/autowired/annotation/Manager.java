package com.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    @Autowired // field Injection
    private Employee employee;

//    @Autowired // Constructor Injection
//    public  Manager(Employee employee){
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
