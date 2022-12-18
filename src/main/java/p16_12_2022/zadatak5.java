package p16_12_2022;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji simulira stampanje
//        ocitane licne karte u vise primeraka.
//        Korisnik unosi podatke :
//        ime
//                prezime
//        jmbg
//        broj primeraka za stampu
//        Primer izvrsenja:
//        Unesite ime: Milan
//        Unesite prezime: Jovanovic
//        Unesite jmbg: 2109238932232
//        Unesite broj primeraka za stampu: 3

        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Unesite jmbg: ");
        String jmbg = s.next();
        System.out.println("Unesite broj primeraka za štampu: ");
        int brojPrim = s.nextInt();
        for( int i = 1; i <= brojPrim; i ++){
            System.out.println("Primerak " + i);
            System.out.println("**********************************");
            System.out.println("Ime i prezime: " + ime + " " + prezime);
            System.out.println("JMBG: " + jmbg);
            System.out.println("**********************************");
            System.out.println();
        }


    }
}
