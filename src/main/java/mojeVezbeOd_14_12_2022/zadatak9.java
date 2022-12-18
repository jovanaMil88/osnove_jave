package mojeVezbeOd_14_12_2022;

import java.util.Scanner;

public class zadatak9 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
//        Napisati program koji simulira ponasanje kontrole za zvuk na jutjubu.
//        Kada se ucita video difoltna jacina zvuka je 75.
//        Korisnik unosi akciju sa tastature. Jednu od sledecih:
//        pojacaj - pojacava zvuka za 10
//        smanji - smanjuje zvuk za 10.
//        mute - postavlja zvuk na 0.
//        Na kraju programa odstampati jacinu zvuka
//        Primer izvrsenja 1:
//        Jacina zvuka je 75.
//        Unesite akciju: pojacaj
//        Nova jacina zvuka je 85
        int zvuk = 75;
        System.out.println("Unesite akciju: ");
        String akcija = s.next();
        if (akcija.equals("pojačaj")) {
            zvuk = 85;
        } else if(akcija.equals("smanji")) {
            zvuk = 65;
        } else if (akcija.equals("mute")) {
            zvuk = 0;
        }
        System.out.println("Nova jačina zvuka je: " + zvuk);


        }

    }


