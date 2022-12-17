package d14_12_2022;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji proverava da li je kliknuto
//        u okviru login forme za web stranicu.
//                Korisnik unosi x i y koordinate za T1, T2 i M.
//        Ispisati odgovarajuce poruke.
//                Primer izvrsenja 1:
//        Unesite x za T1: 10
//        Unesite y za T1: 100
//        Unesite x za T2: 100
//        Unesite y za T2: 0
//        Unestie x za M: 50
//        Unesite y za M: 50
//        Kliknuto je unutar forme

        System.out.println("Unesite x za T1: ");
        double x1 = s.nextDouble();
        System.out.println("Unesite y za T1: ");
        double y1 = s.nextDouble();
        System.out.println("Unesite x za T2: ");
        double x2 = s.nextDouble();
        System.out.println("Unesite y za T2: ");
        double y2 = s.nextDouble();
        System.out.println("Unesite x za M: ");
        double x3 = s.nextDouble();
        System.out.println("Unesite y ta M: ");
        double y3 = s.nextDouble();
        if((x1 < x3 && x2 < x3) && (y1 > y3 && y3 > y2)) {
            System.out.println("Kliknuto je unutar forme.");
        } else {
            System.out.println("Kliknuto je van forme.");
        }
    }

}
