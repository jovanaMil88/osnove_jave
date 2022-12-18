package mojeVezbeOd_16_12_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji od korisnika ucitava jacinu zvuka
//        (od 0 do 10) i stampa slikicu za zvuk
//        sa brojem crtica koje je korisnik uneo.
//        Primer izvrsenja;
//        Unesite jacinu zvuka: 8
//                < | | | | | | | |
        System.out.println("Unesite jacinu zvuka( 1 - 10): ");
        int jacina = s.nextInt();
        System.out.print("<");
        for (int i = 1; i <= jacina; i++) {
            System.out.print("|");

//            (Dopuna za vezbanje)
//            Ukoliko je jacina zvuka 0 stampa se slika </
//            (simulacija za mute) u sprotnom < | | |
//            (sa brojem crtica jacinom zvuka)

            if(jacina == 0){
                System.out.println("</");
            }


        }


    }
}
