package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//         Napisati program koji za sve petocifrene brojeve
//        izvlaci sve cifre i stampa ih na ekranu.
//                Primer izvrsenja:
//        Unesite broj: 19452
//        2, 5, 4, 9, 1
        System.out.println("Unesi petocifreni broj n: ");
        int n = s.nextInt();

        for (int i = 1; i <= 5; i++) {
            int zadnjaCifra = n % 10;
            int ostatak = n / 10;
            n = ostatak;
            System.out.print(zadnjaCifra + ", ");



        }



    }
}
