package mojeVezbeOd21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatk4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji u sebi ima definisan niz od 5 broja
//        (brojevi su proizvoljni) i koji prikazuje element na poziciji K.
//        K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//        Primer:
//        Unesite pozicjiu: 2
//        Na pozicji 2 je vrednost 7.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);

        System.out.println("Unesite poziciju: ");
        int pozicija = s.nextInt();
        System.out.println("Na poziciji " + pozicija + " je vrednost " +  brojevi.get(pozicija));



    }
}
