package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji izvlaci cifre iz visecifrenog broja.
//        Broj koji se unosi je proizvoljan.
//        Napomena: Unosite vrednosti maksimalno do 10 cifara, zbog ogranicenja int tipa.
//        Primer izvrsenja:
//        Unesite broj: 2109349
//        9, 4, 3, 0, 9, 1, 2
        System.out.println("unesite broj do 10 cifara: ");
        int broj = s.nextInt();

        while (broj >= 10){
            int zadnjaCif = broj % 10;
            int ostatak = broj / 10;
            broj = ostatak;
            System.out.print(zadnjaCif + ", ");
        }
        System.out.print(broj);


    }
}
