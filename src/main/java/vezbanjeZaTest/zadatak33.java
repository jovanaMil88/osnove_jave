package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji sabira brojeve koje korisnik unosi, p
//        ritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//        Unesite vrednost: 20
//        Unesite vrednost: 50
//        Unesite vrednost: 50
//        Prekoracenje! Kraj programa. Sracunata suma je 70.
        boolean radi = true;
        int suma = 0;
        int broj = 0;
        while (radi) {
            System.out.println("Unsite boj :");
            broj = s.nextInt();
            suma = suma + broj;
            if (suma > 100) {
                radi = false;
            }
        }
        System.out.println("suma je " + (suma - broj));


    }
}
