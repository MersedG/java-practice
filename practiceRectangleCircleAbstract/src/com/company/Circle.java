package com.company;

public class Circle extends GeoObject {
    private double  r;

    public Circle(String color ,double r){
        this.r = r;
        setColor(color);
    }


    @Override
    public double getSurface() {
        return Math.pow(r,2)* Math.PI;
    }

    @Override
    public double getScope() {
        return 2 * r * Math.PI;
    }
}
