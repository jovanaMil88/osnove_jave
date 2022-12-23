package mojeVezbeOd21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatk3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji u sebi ima definisan niz od 5 broja
//            (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula)
//        i zadnjeg elemnta niza.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);
        int staraNulta = brojevi.get(0);
        int lastIndex = brojevi.size() - 1;
        System.out.println("Nova Zadnja vreenost je " + brojevi.set(lastIndex, staraNulta));
        System.out.println("Nova Nulta vrednost je " + brojevi.set(0, brojevi.get(lastIndex)));





    }
}
