package com.company;

public class Rectangle extends GeoObject {
    private double width;
    private double height;

    public Rectangle(String color,double width , double height){

        super(color);
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return this.height;

    }
    public void setHeight(double height){
        this.height = height;

    }
    //proracun obima pravougaonika
    public double getScope(){
        return  2*height+2*width;

    }
    public double getSurface(){
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color="+getColor() +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
