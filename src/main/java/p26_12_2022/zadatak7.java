package p26_12_2022;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
//                Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//        Primer: Ako se metoda pozove za N=10, vraca -10
//        Ako se metoda pozove za N=-11, vraca 11
suprotniBroj(-12);
    }

    public static int suprotniBroj(int broj) {
        int suprotni = 0;
        if (broj < 0) {
            suprotni = broj * (-1);
        }

        else {
            suprotni = broj * (-1);
        }

        return suprotni;
    }
}