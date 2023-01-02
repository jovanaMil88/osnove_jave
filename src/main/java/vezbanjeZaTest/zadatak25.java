package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak25 {
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
        for (int i = 1; i <= n; i++) {
            int jacina = 0;
            System.out.println("unesite password: ");
            String password = s.next();
            if (password.contains("@")){
                jacina = jacina + 1;
            }
            if (password.length() > 8){
                jacina = jacina + 1;
            }
            System.out.println("Jacina je " + jacina);

        }


    }
}
