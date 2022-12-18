package mojeVezbeOd_14_12_2022;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program za potrebe Makao igrice. Korisnik unosi 4 informacije:
//        znak karte koja je na stolu
//        broj karte koja je na stolu
//        znak karte koju igrac zeli da odigra
//        broj karte koju igrac zeli da odigra
//        i nakon toga se na ekranu ispisuje da li je potez ispravan.
//        Potez je ispravan ukoliko se karta na stolu
//        i odigrana karta poklapaju po znaku ili broju.
//        Primer izvrsenja 1:
//        Znak karte na stolu: srce
//        Broj karte na stolu: A
//        Znak karte koju zelis da odigras: detelina
//        Broja karte koju zelis da odigras: A
//        Potez je validan.
        System.out.println("Znak karte na stolu: ");
        String znakNaStolu = s.next();
        System.out.println("Broj karte na stolu: ");
        String brojNaStolu = s.next();
        System.out.println("Znak karte koju zelis da odigras: ");
        String znakZelim = s.next();
        System.out.println("Broj karte koju zelis da odigras: ");
        String brojZelim = s.next();
        if(znakZelim.equals(znakNaStolu) || brojZelim.equals(brojNaStolu)) {
            System.out.println("Potez je validan.");
        } else {
            System.out.println("Potez nije validan.");
        }

    }
}
