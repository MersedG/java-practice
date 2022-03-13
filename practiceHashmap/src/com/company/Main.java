package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> capitalCities = new HashMap<String , String>();
        //Add keys values (Country, City)
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");
        System.out.println(capitalCities);
        //print keys
        for (String i : capitalCities.keySet()){
            System.out.println(i);
        }
        //print values
        for (String i : capitalCities.values()){
            System.out.println(i);
        }
        //create hashmap object called people
        HashMap<String,Integer> people = new HashMap<String,Integer>();
        //add keys for people
        people.put("John",32);
        people.put("Steve",30);
        people.put("Angie",33);
        for (String i: people.keySet()){
            System.out.println("key: " +i+ " value:" + people.get(i));
        }

    }

}

