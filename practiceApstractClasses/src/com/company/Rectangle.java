package com.company;

public class Rectangle extends GeoObject{
    private double width;
    private double height;

    @Override
    public double getScope() {
        return 2 * (width + height);
    }

    @Override
    public double getSurface() {
        return width * height;
    }
}
