package p14_12_2022;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        (Za vezbanje) Napisati program za potrebe Makao igrice.
//        Korisnik unosi 4 informacije:
//        znak karte koja je na stolu
//        broj karte koja je na stolu
//        znak karte koju igrac zeli da odigra
//        broj karte koju igrac zeli da odigra
//        i nakon toga se na ekranu ispisuje da li je potez ispravan.
//        Potez je ispravan ukoliko se karta na stolu i odigrana karta poklapaju
//        po znaku ili broju.
//
//        Znakovi karata: srce, kocka, list, detelina
//        Brojevi karata: 2,3,4,5,6,7,8,9,10,A,J,Q,K
//        Primer izvrsenja 1:
//        Znak karte na stolu: srce
//        Broj karte na stolu: A
//        Znak karte koju zelis da odigras: detelina
//        Broja karte koju zelis da odigras: A
//        Potez je validan.
//
//                Primer izvrsenja 2:
//        Znak karte na stolu: srce
//        Broj karte na stolu: A
//        Znak karte koju zelis da odigras: srce
        System.out.println("Znak karte koja je na stolu:");
        String znakKNaStolu = s.next();
        System.out.println("Broj karte koja je na stolu: ");
        String brKNaStolu = s.next();
        System.out.println("Znak karte koju zelis da odigras: ");
        String znakKojiZelimo = s.next();
        System.out.println("Broj karte koju igrac zeli da odigra: ");
        String brKojiZelimo = s.next();


        if(brKNaStolu .equals(brKojiZelimo)  || znakKojiZelimo .equals(znakKNaStolu) ) {
            System.out.println("Potez je validan.");
        } else {
            System.out.println("Potez nije validan.");

        }









    }
}
