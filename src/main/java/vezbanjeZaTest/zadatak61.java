package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak61 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        (Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
        System.out.println("Najmanji od data 3 broja je " + vratiNajmanji(25,789,6));
    }
    public static int vratiNajmanji(int a, int b, int c) {
          if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b) {
            return c;
        }else {
            return 0;
        }


    }}