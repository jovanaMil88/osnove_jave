package mojeVezbeOd19_12_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*Napisati program koji pronalazi K-ti stepen broja N. Koristeci FOR petlju
        K i N unosi korisnik.
                Primer izvrsenja:
        Unesite K: 7
        Unesite N: 2
        Rezultat 128*/
        System.out.println("Unesite k: ");
        int k = s.nextInt();
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int stepen = 1;
        for (int i = 1; i <= k; i++) {
            stepen = stepen * n;

        }
        System.out.println("Rezultat je: " + stepen);
    }
}
