package com.car.autowire.by.constructor;

public class Specification {

    private String make;
    private String model;

    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String sampleOut()
    {
        return "This is Sample output";
    }

    @Override
    public String toString() {
        return "Specification{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
