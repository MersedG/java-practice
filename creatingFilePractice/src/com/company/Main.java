package com.company;

import java.io.File;
import java.io.IOException;

public class Main {
//Creating a File in Java practice
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\HOME\\Desktop\\fileename.txt");
        try {
            if (myObj.createNewFile()){

                System.out.println("File created : " +myObj.getName());
            }else{
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
