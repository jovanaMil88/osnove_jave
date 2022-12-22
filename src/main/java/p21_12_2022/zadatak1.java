package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//}2.Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja
//        (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3
//        tako sto je povecava 10 puta.
          ArrayList<Integer> brojevi = new ArrayList<>();
         brojevi.add(0);
         brojevi.add(1);
         brojevi.add(2);
         brojevi.add(3);
         brojevi.add(4);
         brojevi.set(3, 10 * brojevi.get(4));

    }}



