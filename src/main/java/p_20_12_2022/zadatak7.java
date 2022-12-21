package p_20_12_2022;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji izvlaci cifre iz visecifrenog broja.
//        Broj koji se unosi je proizvoljan.
//        Napomena: Unosite vrednosti maksimalno do 10 cifara, zbog ogranicenja int tipa.
//        Primer izvrsenja:
//        Unesite broj: 2109349
//        9, 4, 3, 0, 9, 1, 2
        System.out.println("Unesite broj (1 - 9)");
        int broj = 0;
        int zadnjaCifra = 1;
        while(true){
            zadnjaCifra = broj % 10;
            broj = broj / 10;
            System.out.print(zadnjaCifra + ",");



        }

    }
}
