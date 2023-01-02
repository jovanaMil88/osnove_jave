package java_test;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji petljom iscrtava toplomer.
//        Korisnik sa tastature unosi granice toplomera i iscrtava se slika kao u primeru

        System.out.println("Unesite donju granicu: ");
        int donja = s.nextInt();
        System.out.println("unesite gornju granicu: ");
        int gornja = s.nextInt();

        for (int i = gornja; i >= donja; i--) {
            System.out.println("|-" + i + "|");
        }
        System.out.println("\\   /");
        System.out.println(" | |");


    }
}
