package zadaciZaVezbanje;

import java.util.Scanner;

public class od16_12DomZaVezbanje_zad4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /*Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
                Primer izvrsenja:
        Unesite dimenziju table: 5
                _|_|_|_|_|
                _|_|_|_|_|
                _|_|_|_|_|
                _|_|_|_|_|
                _|_|_|_|_|*/

        System.out.println("Unesite dimenziju table: ");
        int x = s.nextInt();
        for (int i = 1; i <= x; i++) {
        System.out.println();
            for (int j = 1; j <= x ; j++) {
                System.out.print("_|");

            }

            }
        }


        }



