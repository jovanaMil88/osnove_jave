package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ispisuje da li je broj b manji od broja a.
//                A i B unosimo sa tastature.
//        Primer izvrsenja:
//        Unesite a: 1
//        Unesite b: 4
//        B je vece.
        System.out.println("Unesi a: ");
        int a = s.nextInt();
        System.out.println("Unesi b: ");
        int b = s.nextInt();

        if (a < b) {
            System.out.println("B je vece od a.");
        }else if (a > b) {
            System.out.println("A je vece od B.");
        }


    }
}
