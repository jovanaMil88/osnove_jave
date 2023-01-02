package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {

//        Napisati program koji ucitava broj a i ispisuje poruke:
//        Ukoliko je broj a do 10 stampamo da je jednocifren broj
//        Ukoliko je broj a do 100 stampamo da je dvocifren broj
//        Ukoliko je broj a veci od 100 stampamo da je trocifren.
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = s.nextInt();

        if(broj < 10) {
            System.out.println("Jednocifren");
        } else if (broj >= 10 && broj < 100) {
            System.out.println("Dvocifreni.");
        } else if (broj >= 100 && broj < 1000) {
            System.out.println("Trocifrni.");
        }

    }
    }







