package org.example.company;

import org.example.arge.CarSkeleton;

public class Car {
    private boolean engine;
    private int cylinders;
    private String  name;
    private final int wheels;
    private CarSkeleton carSkeleton;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public boolean equals (Object car)
    {
        return ((Car)car).getName() == this.name && ((Car)car).getCylinders() == this.cylinders;
    }


    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
    public String startEngine()
    {
        return "the car's engine is starting";
    }

    public String accelerate()
    {
        return "the car is accelerating";
    }

    public String brake()
    {
        return "the car is braking";
    }



}
