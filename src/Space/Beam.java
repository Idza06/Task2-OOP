/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Space;

import Fields.Rectangle;

/**
 *
 * @author Lenovo
 */
public class Beam extends Rectangle implements CalculateSpace{
    
    private double beamHeight;
    
    //constructor
    public Beam(double beamHeight, double length, double wide){
        super(length, wide);
        this.beamHeight = beamHeight;
    }

    //setter getter
    public double getHeight(){
        return beamHeight;
    }
    
    public void setHeight(double height){
        this.beamHeight = beamHeight;
    }

    @Override
    public double surfaceArea() { //surface area of beam
        return (area() + (getWide() * beamHeight + getLength() * beamHeight)) * 2;
    }

    @Override
    public double volume() { //volume of beam
        return area() * beamHeight;
    }
}
