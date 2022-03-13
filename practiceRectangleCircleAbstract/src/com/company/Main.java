package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle("Yellow",100,50);
        Rectangle rectangle2 = new Rectangle("Green",50,20);
        Rectangle rectangle3 = new Rectangle("Red",150,70);

        ArrayList<GeoObject>rectangles = new ArrayList<>();
        rectangles.add(rectangle1);
        rectangles.add(rectangle2);
        rectangles.add(rectangle3);

        Circle circle1 =  new Circle("Black",40);
        Circle circle2 = new Circle("Pink",100);
        Circle circle3 = new Circle("Blue",200);
        ArrayList<GeoObject>circles = new ArrayList<>();
        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);
        printList(circles);

    }

    public static void printList(ArrayList<GeoObject>geoObjects){
        for(GeoObject o : geoObjects){
            System.out.println(o);
        }
        

    }
}
