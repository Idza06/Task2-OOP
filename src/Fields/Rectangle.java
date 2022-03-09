/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fields;
/**
 *
 * @author Lenovo
 */
public class Rectangle implements CalculateField{
    
    private double wide, length;
    
    public Rectangle(double wide, double length){
        this.wide = wide;
        this.length = length;
    }
    
    public double getWide(){
        return wide;
    }
    
    public void setWide(double wide){
        this.wide = wide;
    }
    
    public double getLength(){
        return length;
    }
    
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double circumference() {
        return(length * 2) + (wide * 2);
    }

    @Override
    public double area() {
        return length * wide;
    }
}
