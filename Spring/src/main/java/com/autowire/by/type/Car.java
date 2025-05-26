package com.autowire.by.type;


public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){

        System.out.println("car Details" + " " + specification.toString());
    }
}
