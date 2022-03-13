package com.company;

import java.util.ArrayList;

public class Developer extends Employee {
    private int numOfProjects;
    private ArrayList<String> teams = new ArrayList<>();

    public Developer(String firstName, String lastName, String id , double salary , int numOfProjects){
        super(firstName,lastName,id,salary);
        this.numOfProjects=numOfProjects;

    }

    @Override
    public String toString() {
        return "Developer{" +
                "numOfProjects=" + numOfProjects +
                ", teams=" + teams +
                '}';
    }
}
