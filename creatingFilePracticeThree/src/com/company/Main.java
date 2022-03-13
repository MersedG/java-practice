package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	File file = new File("file1.txt");

       file.createNewFile();

        System.out.println(file.canRead());




    }
}
