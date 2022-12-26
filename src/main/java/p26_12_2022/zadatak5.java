package p26_12_2022;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati metodu koja stampa N zvezdica u istom redu,
//                na kraju reda stampa novi red..
//        Broj zvezdica je odredjen parametrom N.
//        Ako se metoda pozove za N=5, metoda stampa 5 zvezdica i enter
//        N=5, print je=> * * * * *
        zvezdica(5);
        System.out.println(" ");
        zvezdica(9);
    }
    public  static void zvezdica (int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            System.out.print(" ");
        }}

}
