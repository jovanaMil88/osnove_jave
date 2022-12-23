package d_20_12_2022;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ucitava brojeva od korisnika
//        i za svaki broj prikazuje apsolutnu vrednost sve dok se ne unese nula.
//
//        Primer izvrsenja:
//        Unesite broj: 3
//        Apsolutna vrednost je 3
//        Unesite broj: -1
//        Apsolutna vrednost je 1
//        Unesite broj: 0
//        Kraj programa jer je uneta nula.

        System.out.println("Unesite broj: ");
        int broj = s.nextInt();

        while (!(broj == 0)) {
            if (broj < 0) {
                System.out.println("Apsolutna vrednost je " + (broj * (-1)));
            } else if (broj > 0) {
                System.out.println("Apsolutna vredost je " + broj);
            }
            System.out.println("Unesite broj: ");
                broj = s.nextInt();


        }
        System.out.println("Kraj.");


    }
}
