package com.company;
import  java.util.Scanner;
public class Main {

        public static void main(String[] args) {

            double[] list = new double[10];
            Scanner scanner = new Scanner(System.in);

            for(int i = 0; i<list.length;i++){
                list[i] = Math.random()*100;
                }
            for(int i = 0; i< list.length;i++){
                System.out.println(list[i]+"");
            }
        }




            }


