package p16_12_2022;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati porogram koji od korisnika ucitava dva broja
//        M i N i stampa sve brojeve izmedju M i N.
//                Smatrajte da je M manje od N.
//                Primer izvrsenja:
//        Unesite M: 10
//        Unesite N: 15
//        10, 11, 12, 13, 14, 15,
//                Print da vam bude u jednom redu i sa zarezima!

        System.out.println("Unesite M: ");
        int m = s.nextInt();
        System.out.println("Unesite N (broj veci od M): ");
       int n = s.nextInt();
       for (int i = m; i < n; i ++){
           System.out.print(i + ", ");

        }

    }
}
