package mojeVezbeOd19_12_2022;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*Napisati program koji od korisnika ucitava N brojeva
        i ispisuje koliko je parnih brojeva uneo korisnik.
        N nam kaze koliko broja ce korisnik da unese.
                Primer izvrsenja:
        Unesite N: 6
        Unesite broj: 2
        Unesite broj: 4
        Unesite broj: 9
        Unesite broj: 12
        Unesite broj: 8
        Unesite broj: 1
        Uneto je 4 parna broja.*/
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if (broj % 2 == 0) {
                counter = counter + 1;
            }
            }
        System.out.println("Uneto je " + counter + " parna broja.");



        }
    }

