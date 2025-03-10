package com.workintech.cylinder;

public class Circle {
    private double radius;

    public Circle() {
        this.radius = 0; // Varsayılan olarak radius 0
    }

    public Circle(double radius){
        if(radius<0){
            this.radius=0;
        }else{
            this.radius=radius;
        }
    }

    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
