package com.company;

public abstract class GeoObject {
    private String color;

    public String getColor(){
        return this.color;

    }
    public void setColor(String color){
        this.color = color;
    }
    public abstract double getScope();
    public abstract double getSurface();

}
