package p14_12_2022;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
//        Unesite ime: Milan
//        Unesite prezime: Jovanvoci
//        Unesite broj: +209329832
//        Unesite email: milan@gmail.com
//        Unesite jmbg: 329032938923
//
//        Milan Jovanovic - 329032938923
//        Broj tel:  +209329832
//        Email: milan@gmail.com
       Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = s.next();
        System.out.println("Unesite prezime: ");
        String prezime = s.next();
        System.out.println("Unesite broj: ");
        String broj = s.next();
        System.out.println("Unesite email: ");
        String email = s.next();
        System.out.println("Unesite jmbg: ");
        String jmbg = s.next();

        System.out.println(ime + prezime + " - " + jmbg);
        System.out.println("Broj tel: " + broj);
        System.out.println("Email: " + email);





    }
}
