package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }


    @Override
    public String startEngine()
    {
        return "the Holden's engine is starting";
    }
    @Override
    public String accelerate()
    {
        return "the Holden Car is accelerating";
    }
    @Override
    public String brake()
    {
        return "the Holden is braking";
    }
}
