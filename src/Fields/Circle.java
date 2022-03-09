/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fields;
/**
 *
 * @author Lenovo
 */
public class Circle implements CalculateField{
    
    private double radius;
    private double pi = 3.14159;
    
    public Circle(double radius, double pi){
        this.radius = radius;
        this.pi = pi;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(){
        this.radius = radius;
    }

    @Override
    public double circumference() {
        return 2 * pi * radius;
    }

    @Override
    public double area() {
        return pi * (radius*radius);
    }
    
    
}
