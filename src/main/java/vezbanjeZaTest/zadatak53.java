package vezbanjeZaTest;

import java.util.Scanner;

import static mojeVezbeOd26_12_2022.zadatak9_je_ipak8.jePravougli;

public class zadatak53 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati metodu koja proverava da li je trougao pravougli.
//                Metoda prima stranice trougla i hipotenuzu trougla.
//        Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//                Trougao je pravougli ukoliko je a*a+b*b=c*c
        if (jePravougli(4,5,6) == true) {
            System.out.println("pravougli.");
        } else{
            System.out.println("nije");

        }


    }
    public static boolean jePravougli(int a, int b, int c){
        if (a * a + b * b == c * c) {
            return true;
        }else {
            return false;
        }

    }


        }



