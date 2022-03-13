package com.company;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"Dobro dosli u vas digitron pritisnite OK ");
        Scanner unos = new Scanner(System.in);
        double a = Double.parseDouble(JOptionPane.showInputDialog("Unesite prvi broj"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("unesite drugi broj"));

        String f = JOptionPane.showInputDialog("Unesite fuknciju");
        switch (f){
            case ("+"):
                JOptionPane.showMessageDialog(null,"Zbir brojeva "+a+ " i " +b+ " je " +(a+b));
                break;

            case ("-"):
                JOptionPane.showInputDialog("Razlika brojeva "+a+ " i " +b+ " je " +(a-b));
                break;

            case ("*"):
                JOptionPane.showMessageDialog(null,"Rezultat mnozenja brojeva "+a+ " i " +b+ " je " +(a*b));
                break;

            case ("/"):
                JOptionPane.showMessageDialog(null,"Rezultat dijeljenja brojeva "+a+ " i " +b+ " je " +(a-b));
                break;

            default:
                JOptionPane.showMessageDialog(null,"Unesite neku of funkcija + ,- ,* ,/");
        }


    }


}
