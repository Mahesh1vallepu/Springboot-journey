package com.car.autowire.by.constructor;


public class Car {
    private Specification specification;


    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){

        System.out.println("car Details" + " " + specification.toString());
        System.out.println(specification.sampleOut());
    }
}
