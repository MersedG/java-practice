package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
//Another practice creating a File and writing inside that file in JAVA
    public static void main(String[] args) {
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky , but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();

        }

    }
}
