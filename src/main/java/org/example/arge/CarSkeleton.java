package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton()
    {}

    public void drive()
    {
        this.runEngine();
    }

    protected void runEngine()
    {

    }


    public void startEngine()
    {

    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
