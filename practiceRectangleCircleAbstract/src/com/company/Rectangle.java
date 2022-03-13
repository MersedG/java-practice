package com.company;

public class Rectangle extends GeoObject{

    private double width;
    private double height;

    public Rectangle(String color,double width,double height){
        this.width=width;
        this.height=height;
        setColor(color);
    }

    @Override
    public double getSurface() {
        return width * height;
    }

    @Override
    public double getScope() {
        return 2*(width + height);
    }
}
