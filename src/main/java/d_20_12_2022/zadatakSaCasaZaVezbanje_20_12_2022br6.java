package d_20_12_2022;

import java.util.Scanner;

public class zadatakSaCasaZaVezbanje_20_12_2022br6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        (ZA VEZBANJE) Napisati program koji izvlaci cifre iz visecifrenog broja.
//        Broj koji se unosi je proizvoljan.
//        Napomena: Unosite vrednosti maksimalno do 10 cifara, zbog ogranicenja int tipa.
//        Primer izvrsenja:
//        Unesite broj: 2109349
//        9, 4, 3, 0, 9, 1, 2
        int zadnajCif = 1;
        boolean radi = true;
        System.out.println("Unesite višecifreni broj: ");
        int broj = s.nextInt();
        while (radi) {
            zadnajCif = broj % 10;
            broj = broj / 10;
            if (broj < 10) {
                radi = false;
            }
            if (broj >= 10) {
                System.out.print(zadnajCif + ", ");
            }
            if (broj < 10) {
                System.out.print(broj);
            }
        }
    }
}


