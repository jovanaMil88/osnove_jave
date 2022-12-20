package mojeVezbeOd19_12_2022;

import java.util.Scanner;

public class zadatak9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        (Za vezbanje) Napisati program koji za sve petocifrene brojeve
//        izvlaci sve cifre i stampa ih na ekranu.
//Primer izvrsenja:
//Unesite broj: 19452
//2, 5, 4, 9, 1
        System.out.println("Unesi petocifreni broj n: ");
        int n = s.nextInt();
        int ostatak = 0;
        int zadnjaCifra = 0;
        for (int i = 0; i < 5; i++) {
            zadnjaCifra = n % 10;
            n = n / 10;
            System.out.print(zadnjaCifra + ", ");
        }


        }
    }

