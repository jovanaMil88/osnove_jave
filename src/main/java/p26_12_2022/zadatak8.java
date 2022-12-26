package p26_12_2022;

import java.util.Scanner;

public class zadatak8 {
    public static void main(String[] args) {
//        Napisati metodu koja proverava da li je trougao pravougli.
//                Metoda prima stranice trougla i hipotenuzu trougla.
//        Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//                Trougao je pravougli ukoliko je a*a+b*b=c*c

        Scanner s = new Scanner(System.in);
        ifPravougli(7,4,6);


    }
    public  static boolean ifPravougli (int a, int b, int c) {
        boolean trougao = true;
        if (a*a + b*b == c*c){
            return trougao;
        }else {
            trougao = false;
            return trougao;
        }
    }

    }
