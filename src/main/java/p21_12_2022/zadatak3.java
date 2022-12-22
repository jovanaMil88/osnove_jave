package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji u sebi ima definisan niz od 5 broja
//            (brojevi su proizvoljni) i koji prikazuje element na poziciji K.
//                K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//        Primer:
//        Unesite pozicjiu: 2
//        Na pozicji 2 je vrednost 7.
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(0);
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);

        System.out.println("Unesite poziciju 0 - 4: ");
        int pozicija = s.nextInt();
        brojevi.get(pozicija);
        System.out.println("Na poziciji je vrednost " + brojevi.get(pozicija));



    }}

