package com.workintech.pool;

import javax.swing.*;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 0; // Varsayılan olarak width 0
        this.length = 0; // Varsayılan olarak length 0
    }


    public Rectangle(double width, double length){
        if(width<0){
            this.width=0;
        }else{
            this.width=width;
        }
        if(length<0){
            this.length=0;
        }else{
            this.length=length;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return width * length;
    }
}
