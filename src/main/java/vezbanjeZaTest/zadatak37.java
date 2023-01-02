package vezbanjeZaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji u sebi ima definisan niz od 5 broja
//            (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3
//        tako sto je povecava 10 puta.
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);
        brojevi.set(3, brojevi.get(3) * 10);



    }
}
