package java_test;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji cuva dva niza celih brojeva,
//        jedan za parne brojeve a drugi za neparne brojeve.
//        Program sa tastature ucitava N brojeva koje unosi korisnik
//        i parne brojeve dodaje u niz parnih brojeva a neparne brojeve u niz neparnih.
//        Na kraju programa odstampati brojeve oba niza kao i sumu svakog niza.
//        Napomena: Nizovi se stampaju koristeci petlje.
        ArrayList<Integer> parni = new ArrayList<Integer>();
        ArrayList<Integer> neparni = new ArrayList<Integer>();

        System.out.println("Unesite n: ");
        int n = s.nextInt();

        int sumaP = 0;
        int sumaN = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if (broj % 2 == 0) {
                parni.add(broj);
            } else {
                neparni.add(broj);
            }

        }
        System.out.print("Niz parnih: ");
        for (int i = 0; i < parni.size(); i++) {
            System.out.print(parni.get(i) + ", ");
            sumaP = sumaP + parni.get(i);

        }
        System.out.println();

        System.out.print("Niz parnih: ");
        for (int i = 0; i < neparni.size(); i++) {
            System.out.print(neparni.get(i) + ", ");
            sumaN = sumaN + neparni.get(i);
        }
        System.out.println("Suma parnih brojeva je: " + sumaP);
        System.out.println("Suma neparnih brojeva je: " + sumaN);
    }

}








