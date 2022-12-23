package mojeVezbeOd21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatk1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji u sebi ima definisan niz od 5 broja
//            (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.

                ArrayList<Integer> brojevi = new ArrayList<Integer>();
                brojevi.add(10);
                brojevi.add(20);
                brojevi.add(30);
                brojevi.add(40);
                brojevi.add(50);
                int suma = brojevi.get(0) + brojevi.get(brojevi.size() - 1);
        System.out.println("Suma je: " + suma );





    }
}
