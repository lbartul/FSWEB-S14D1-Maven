package com.workintech.cylinder;

public class Circle {
    private  double radius;

    // Constructor
    public Circle(double radius){
        if (radius < 0){
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // Getter for radius
    public double getRadius(){
        return radius;
    }

    // Area hesaplama
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
