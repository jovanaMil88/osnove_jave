package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListbrijevi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
//        Napisati program koji u sebi ima definisan niz od 5 broja
//       (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.

       brojevi.add(0);
       brojevi.add(1);
       brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);
        System.out.println("Suma je:" + (brojevi.get(0) + brojevi.get(4)));


    }
}
