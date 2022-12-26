package p26_12_2022;

import java.util.Scanner;

public class zadatak3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
//        Brojevi su ulazni parametri funkcije.
//                U gravnom programu pozvati nekoliko puta funkciju
//        sa razlicitim prosledjenim vrednostima.
        operacije(7,3);
        System.out.println(" ");
        operacije(9,3);

    }
    public  static void operacije ( int a, int b) {
        System.out.println("Zbir: " + a + b);
        System.out.println("razlika : " + (a - b));
        System.out.println("Proizvod: " + (a * b));
        System.out.println("kolicnik: " + (a / b));


    }}


