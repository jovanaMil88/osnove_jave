package d_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak5zaVezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//       Napisati program koji ucitava niz a duzine N.
//        Nakon unosa niza a, formira se niz b tako sto
//        se prva 3 elementa niza a kopiraju u niz b,
//        a ostale elemente niza b ispuniti jedinicama.
//        (niz b je iste duzine kao i niz a)
//
//        Unesite N: 6
//        Unesite broj: 1
//        Unesite broj: 5
//        Unesite broj: 2
//        Unesite broj: 7
//        Unesite broj: 8
//        Unesite broj: -1
//
//        Niz a: 1, 5, 2, 7, 8, -1
//        Niz b: 1, 5, 2, 1, 1, 1
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        ArrayList<Integer> brojeviCopy = new ArrayList<Integer>();
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj:");
            int broj = s.nextInt();
            brojevi.add(broj);
        }
        System.out.print("Niz a: ");
        for (int i = 0; i < n; i++) {
            System.out.print(brojevi.get(i) + ", ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            brojeviCopy.add(brojevi.get(i));
        }
        for (int i = 3; i < n; i++) {
            brojeviCopy.add(1);
        }
        System.out.print("Niz b: ");
        for (int i = 0; i < n; i++) {
            System.out.print(brojeviCopy.get(i) + ", ");

        }

    }


}
