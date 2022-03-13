package com.company;

public class Employee {
    private String firstName;
    private String lastName;
    private String id;
    private double salary;
    public Employee(String firstName, String lastName, String id, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
}
