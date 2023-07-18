package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci la base!");
        int base = scan.nextInt();

        System.out.println("inserisci l'altezza!");
        int altezza = scan.nextInt();

        Rettangolo rec = new Rettangolo(base, altezza);

        System.out.println("Area : " + rec.calcolaArea());
        System.out.println("Perimetro : " + rec.calcolaPerimetro());



    }

}
