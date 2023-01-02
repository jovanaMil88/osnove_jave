package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak47 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati dve metode, jedna metoda sluzi za stampanje imena
//        a druga sluzi za stampanje prezimena.
//        U glavnom programu pozvati metode na izvrsenje tako da se 5 puta ispise ime i prezime
//        u istom redu.
//        Primer izvrsenja:
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
//        Milan Jovanovic
        stampajIme();
        stampajPrezime();
        System.out.println();
        stampajIme();
stampajPrezime();
        System.out.println();
        stampajIme();
        stampajPrezime();
        System.out.println();stampajIme();
        stampajPrezime();
        System.out.println();stampajIme();
        stampajPrezime();
        System.out.println();

    }

    public static void stampajIme(){
        System.out.print("Jovana ");
    }
    public static void stampajPrezime(){
        System.out.print("Milojevic");
    }
}
