/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Space;

import Fields.Circle;

/**
 *
 * @author Lenovo
 */
public class Cylinder extends Circle implements CalculateSpace{
    
    private double cylinderHeight;
    
    //constructor
    public Cylinder(double cylinderHeight, double radius, double pi){
        super(radius, pi);
        this.cylinderHeight = cylinderHeight;
    }
    
    //setter getter
    public double getHeight(){
        return cylinderHeight;
    }
    
    public void setHeight(double cylinderHeight){
        this.cylinderHeight = cylinderHeight;
    }

    @Override
    public double surfaceArea() { //surface area of cylinder
        return (2 * area()) + (circumference() * cylinderHeight);
    }

    @Override
    public double volume() { //volume of cylinder
        return area() * cylinderHeight;
    }
}
