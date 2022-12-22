package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


//    Napisati program koji u sebi ima definisan niz od 5 broja
//            (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula)
//        i zadnjeg elemnta niza.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);
        int staraNulta = brojevi.get(0);
        int staraPeta = brojevi.get(4);
        brojevi.set(0, staraPeta);
        brojevi.set(0, staraNulta);




}}
