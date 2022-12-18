package p14_12_2022;

import java.util.Scanner;

public class scannerUvod {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite vrednost za a: ");

        int a = s.nextInt();
        System.out.println("Unesite vrednost za b: ");
        int b = s.nextInt();
        int sum = a + b;
        System.out.println( "Rezultat je: " + sum);
    }
}
