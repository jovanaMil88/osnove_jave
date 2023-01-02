package vezbanjeZaTest;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class zadatak42 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();

//        (Za vezbanje) Napisati program koji vrsi mesanje niza.
//        Niz je duzine 10, proizvoljnih brojeva.
//                Mesanje niza se vrsi tako sto se 8 puta vrsi zamena dva random elementa iz niza.
//        primer jedne zamene:
//        Ako je niz
//        1,2,3,4,5,6,7,8,9,10
//        i prvi random indeks je 4 a drugi random indeks je 6
//        1,2,3,4,7,6,5,8,9,10
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);
        brojevi.add(60);
        brojevi.add(70);
        brojevi.add(80);
        brojevi.add(90);
        brojevi.add(100);


        int x = random.nextInt(10);
        int y = random.nextInt(10);

        for (int i = 0; i < 8; i++) {
            int staraX = brojevi.get(x);
            int staraY = brojevi.get(y);

            brojevi.set(x,staraY);
            brojevi.set(y, staraX);

        }



    }
}
