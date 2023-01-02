package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

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
        System.out.println("Unesi akciju: ");
        String akcija = s.next();
        int jacina = 75;

        if (akcija.equals("pojacaj")) {
            jacina = jacina + 10;
        } else if (akcija.equals("smanji")) {
            jacina = jacina - 10;
        } else if (akcija.equals("mute")) {
            jacina = 0;
        }
        System.out.println("jacina je: " + jacina);

    }

}




