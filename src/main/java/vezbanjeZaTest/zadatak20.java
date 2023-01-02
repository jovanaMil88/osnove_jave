package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji od korisnika ucitava N jednocifrenih brojeva
//        i od njih formira rezultujuci broj kao na primeru
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 2
//        Unesite broj: 0
//        Unesite broj: 4
//        Unesite broj: 1
//        Rezultujuci broj je 12041 (Promenljiva tipa int)

        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int noviBroj = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            noviBroj = (noviBroj * 10) + broj;

        }
        System.out.println("Novi broj je : " + noviBroj);


    }

}
