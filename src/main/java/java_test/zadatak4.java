package java_test;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Unesite lozinku: ");
        String lozinka1 = s.next();
        System.out.println("Potvrdite lozinku: ");
        String lozinka2 = s.next();

        int counter = 0;

        while (!lozinka1.equals(lozinka2) && counter <= 3) {
            System.out.println("Lozinke se ne poklapahu.");
            System.out.println("Potvrdite lozinku: ");
            lozinka2 = s.next();
            counter++;
        }
            if (counter <= 3) {
                System.out.println("Mogucnost postavljanja lozinke je blokirana.");
            } else if (lozinka2.equals(lozinka1)) {
                System.out.println("Lozinka je uspesno postavljena");
        }




        }
    }




