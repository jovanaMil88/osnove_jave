package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji od korisnika ucitava N brojeva
//        i ispisuje sumu tih brojeva. N nam kaze koliko broja ce korisnik da unese.
//                Primer izvrsenja:
//        Unesite N: 3
//        Unesite broj: 1
//        Unesite broj: 4
//        Unesite broj: 9
//        Suma je 14
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            suma = suma + broj;
        }
        System.out.println("Suma je " + suma);

    }

}
