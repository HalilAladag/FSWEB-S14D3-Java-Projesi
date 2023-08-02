package com.workintech.model;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String startEngine() {
        return "CarSkeleton: Engine is starting";
    }

    public String drive() {
        return "CarSkeleton: Car is driving";
    }

    protected String runEngine() {
        return "CarSkeleton: Engine is running";
    }
}

