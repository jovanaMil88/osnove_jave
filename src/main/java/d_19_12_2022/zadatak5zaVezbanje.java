package d_19_12_2022;

import java.util.Random;
import java.util.Scanner;

public class zadatak5zaVezbanje {
    public static void main(String[] args) {
//        Napisati program za ucenje matematike. Program daje korisniku 5 matematickih zadataka.
//        Svaki nivo predstavlja jednu iteraciju petlje i
//        u svakom nivou korisniku se prikazuju dva random broja koja treba da sabere
//        i poruka o tacnosti resenja. (Program generise random brojeve u opsegu od 0 do 50,
//            ne unosi ih korisnik)
//        Primer izvrsenja:
//        Koliko je 1 + 4? 5
//        Cestitam!
//                Koliko je 3 + 34? 23
//        Greska!
//                Koliko je 23 + 12? 45
//        Greska!
//                Koliko je 23 + 12? 24
//        Greska!
//                Koliko je 1+ 4? 5
//        Cestitam!

                Scanner s = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int x = random.nextInt(50);
            int y = random.nextInt(50);
            System.out.print("Koliko je " + x + " + " + y + "? ");
            int broj = s.nextInt();
            if (broj == x + y) {
                System.out.println("Cestitam!");
            }else {
                System.out.println("Greška!");
            }

        }
    }
}
