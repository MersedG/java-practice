package com.company;

public abstract class GeoObject {
    private String color;

    public abstract double getSurface();

    public abstract double getScope();
    public void setColor(String color){
        this.color=color;
    }


}
