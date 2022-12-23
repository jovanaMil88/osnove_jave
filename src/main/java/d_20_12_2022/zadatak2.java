package d_20_12_2022;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ucitava RIMSKE brojeva od korisnika
//        i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//        Primer izvrsenja:
//        Unesite rimski broj: X
//        Arapski: 10
//        Unesite rimski broj: C
//        Arapski: 50
//        Unesite rimski broj: D
//        Arapski: 500
//        Unesite rimski broj: M
//        Arapski: 1000
//        Unesite rimski broj: I
//        Arapski: 1
//        Unesite rimski broj: KRAJ
//        Kraj programa.
        System.out.println("Unesite rimski broj: ");
        String rimski = s.next();
        while(!rimski.equals("KRAJ")){
            if(rimski.equals("X")) {
                System.out.println("Arapski je 10.");
            } else if (rimski.equals("C")) {
                System.out.println("Arapski je 50.");
            } else if (rimski.equals("D")) {
                System.out.println("Arapski je 500.");
            }else if (rimski.equals("M")) {
                System.out.println("Arapski je 1000.");
            }else if (rimski.equals("I")) {
                System.out.println("Arapski je 1.");
            }else {
                System.out.println("Unos je nevalidan.");
            }
                System.out.println("Unesite rimski broj: ");
                rimski = s.next();
            }

            System.out.println("Kraj.");
        }

        }







