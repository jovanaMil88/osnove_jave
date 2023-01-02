package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji validira unos input polja za broj.
//                Polje za unos prima samo brojeve u opsegu od 10 do 50.
//        Korisnik unosi vrednosti dok ne unese validan  broj.
//        Primer izvrsenja:
//        Unesite broj: 5
//        Greska: Broj nije u opsegu od 10 do 50.
//        Unesite broj: -1
//        Greska: Broj nije u opsegu od 10 do 50.
//        Unesite broj: 51
//        Greska: Broj nije u opsegu od 10 do 50.
//        Unesite broj: 40
//        Broj je validan, kraj programa.

        System.out.println("unesite broj: ");
        int broj = s.nextInt();

        while( broj < 10 || broj > 50){
            System.out.println("Greška: Broj nije u opsegu:");
            System.out.println("unesite broj: ");
            broj = s.nextInt();
        }
        System.out.println("Broj je validan. ");



    }
}
