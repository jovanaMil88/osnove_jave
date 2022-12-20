package mojeVezbeOd19_12_2022;

import java.util.Scanner;

public class zadatak12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program prikazuje koliko je svaki od unetih passworda jak.
//        Korisnik unosi N passworda i za svaki se ispisuje jacina.
//        Svaki uslov koji password ispunjava dodaje po 1 poen:
//        duzina veca od 8
//        sadrzi @ specijalan karakter
//
//        Primer izvrsenja:
//        Unesite N: 3
//        Unesite password: passwdr
//        Password ima 0 poena.
//                Unesite password: password123
//        Password ima 1 poena.
//                Unesite password: password@123
//        Password ima 2 poena.
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        int jacina = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite password" );
            String password = s.next();
            if (password.length() >= 8) {
                jacina = jacina + 1;
            }
            if (password.contains("@")){
                jacina = jacina + 1;
            }
            System.out.println("Password ima " + jacina + " bodova.");
            jacina = 0;
        }


    }
}
