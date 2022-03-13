package com.company;

public class GeoObject {
    private String color = "white";
    private boolean isColored;
    public GeoObject(){}
    public GeoObject(String color){
        this.color=color;
        if(color.equals("white")){
            isColored=true;
        }

    }
    public String getColor(){
        return this.color;
    }
    public void setColor(){
        this.color=color;

    }
    public void setColored(boolean isColored){
        this.isColored=isColored;
    }
    public boolean  getColored(){
        return getColored();
    }

    @Override
    public String toString() {
        return "GeoObjekat{" +
                "color='" + color + '\'' +
                ", isColored=" + isColored +
                '}';
    }
}
