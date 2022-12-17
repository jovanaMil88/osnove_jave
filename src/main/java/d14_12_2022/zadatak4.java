package d14_12_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji za unetu vrednost x
//        odredjuje i prikazuje vrednost funkcije y.
//        Iskoristite if/else za racunanje informacije i tek nakon te logike
//        odstampajte vrednost y na ekranu.Funkcija y je definisana kao:
//        Ako je x manje od 2, y je jednako x
//        Ako je x u opsegu od 2 do 10, y je jednako 2
//        Ako je x vece od 10, y je x-1
//        Primer izvrsenja 1:
//        Unesite x: -3
//        y = -3
//
//        Primer izvrsenja 2:
//        Unesite x: 5
//        y = 2
//
//        Primer izvrsenja 3:
//        Unesite x: 30
//        y=29
        System.out.println("Unesite x: ");
        int x = s.nextInt();
        int y = 0;
        if( x < 2){
            y = x;
        } else if(x >= 2 && x < 10) {
            y = 2;
        }else if(x >= 10) {
            y = x - 1;
        }
        System.out.println("Vrednost y je " + y);
        }


    }

