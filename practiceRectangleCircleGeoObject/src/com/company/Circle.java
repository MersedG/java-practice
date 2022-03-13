package com.company;

public class Circle extends GeoObject {
    private double radius;
    public Circle(String color,double Radius){
        super(color);
        this.radius = radius;

    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    public double getScope(){
        return 2 * radius * Math.PI;
    }
    public double getSurface(){
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color =" + getColor();
    }
}
