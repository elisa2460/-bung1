package org.example;

public class Main {
    public static void main(String[] args) {

        //Tabita wie gehts wie stehts.
        //Mir geht gut dir?
        System.out.printf("Hello and welcome Tabita!");
        System.out.println("How are you? ");


        //Deklaration und Initialisierung von Variablen
        int zahl1= 5;
        int zahl2= 4;
        int addition;
        double zahl3 = 8.8;
        double zahl4 = 4.5;
        double substraction;
        for (int i = 1; i <= 5; i++) {
           //addition und subtraction
            addition = zahl1 + zahl2;
            substraction = zahl3 - zahl4;
            System.out.println("summe = " + addition);
            System.out.println("substraction = " + substraction);

        }
    }
}