package com.company;

public class Circle  extends GeoObject{

    private double radius;
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getScope() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double getSurface() {
        return Math.pow(radius,2) * Math.PI;
    }
}
