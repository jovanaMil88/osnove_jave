package d_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
//                Napisati program koji ucitava niz A duzine N i broj X.
//                Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//                Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 7
//        Unesite broj: 3
//        Unesite broj: 9
//        Unesite X: 3
//
//        Rezultat: Elementi niza A koji su jednaki broju X imaju indekse:
//        1, 3


        System.out.println("Unesite n: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = s.nextInt();
            brojevi.add(broj);
        }
        System.out.println("Unesite X: ");
        int x = s.nextInt();
        System.out.print("Elementi niza koji su jednaki broju X imaju indexe: ");
        for (int i = 0; i < brojevi.size(); i++) {
            if (brojevi.get(i) == x) {
                System.out.print(i + ", ");
            }

        }

    }
}
