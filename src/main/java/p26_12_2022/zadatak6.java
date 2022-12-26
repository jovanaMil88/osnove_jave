package p26_12_2022;

import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati main program koji koristi metodu definisanu u 6.zad
//        tako da stampa sledecu sliku za M. M unosi korisnik.
//
//                Primer izvrsenja:
//        Unesite M: 6
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * * * *
        System.out.println("uNESITE M: ");
        int m = s.nextInt();
        for (int i = 1; i <= m; i++) {
            zvezdica(i);
        }


    }

    public  static void zvezdica (int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
            }
        System.out.println(" ");
}}
