package com.setter.injection;

public class Car {

    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){

        System.out.println("car Details" + " " + specification.toString());
    }
}
