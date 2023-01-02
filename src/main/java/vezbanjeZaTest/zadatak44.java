package vezbanjeZaTest;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class zadatak44 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ucitava niz a duzine N.
//        Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//                a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
//        Unesite N: 6
//        Unesite broj: 1
//        Unesite broj: 5
//        Unesite broj: 2
//        Unesite broj: 7
//        Unesite broj: 8
//        Unesite broj: -1
//        Niz a: 1, 5, 2, 7, 8, -1
//        Niz b: 1, 5, 2, 1, 1, 1
        AbstractList<Integer> brojevi1 = new ArrayList<>();
        AbstractList<Integer> brojevi2 = new ArrayList<>();



        System.out.println("Unesite broj N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("unesite broj: ");
            int broj = s.nextInt();
            brojevi1.add(broj);
        }
        System.out.print("Niz a je: ");
        System.out.println();

        for (int i = 0; i < brojevi1.size(); i++) {
            System.out.print(brojevi1.get(i) + ", ");
        }
        for (int i = 0; i < 3; i++) {
            brojevi2.add(brojevi1.get(i));
        }
        for (int i = 3; i < n; i++) {
            brojevi2.add(1);
        }
        System.out.print("Niz b je: ");
        for (int i = 0; i < brojevi2.size(); i++){
            System.out.print(brojevi2.get(i));

        }
        }
    }

