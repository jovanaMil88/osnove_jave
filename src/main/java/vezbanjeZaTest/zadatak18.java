package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji pronalazi K-ti stepen broja N. Koristeci FOR petlju
//        K i N unosi korisnik.
//                Primer izvrsenja:
//        Unesite K: 7
//        Unesite N: 2
//        Rezultat 128
        System.out.println("Unesite k: ");
        int k = s.nextInt();
        System.out.println("Unesite n: ");
        int n = s.nextInt();

        int proizvod = 1;

        for (int i = 1; i <= k; i++) {
            proizvod = proizvod * n;
        }
        System.out.println("Proivod je " + proizvod);

        }

    }


