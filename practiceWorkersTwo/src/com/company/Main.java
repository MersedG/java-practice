package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Developer> list = new ArrayList<>();
        Developer developer1 = new Developer("John","Doe","12345456",3000,2);
        Developer developer2 = new Developer("Jane","Dodge","123454562",4000,2);
        Developer developer3 = new Developer("Mujo","Mujic","1234545226",5000,3);
        Developer developer4 = new Developer("Suljo","Suljic","1222345456",2000,1);
        list.add(developer1);
        list.add(developer2);
        list.add(developer3);
        list.add(developer4);
        System.out.println(list);

    }


    }

