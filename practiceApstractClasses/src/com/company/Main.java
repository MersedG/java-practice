package com.company;

import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) {
        // ne moze se kreirati objekat abstraktne klase
        //  GeoObject geoObject = new GeoObject();
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("white");
        Circle circle = new Circle();
        circle.setRadius(4.20);
        circle.getScope();
        System.out.println(circle.getScope());
    }
}