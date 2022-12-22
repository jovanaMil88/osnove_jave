package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati progam koji stampa niz u obrnutom redosledu
//        tj. od zadnjeg elementa do nultog.
//                Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);
       int lastIndex = brojevi.size() -1;
        for (int i = lastIndex; i >= 0; i --) {
            System.out.println(brojevi.get(i));
        }





        }


    }

