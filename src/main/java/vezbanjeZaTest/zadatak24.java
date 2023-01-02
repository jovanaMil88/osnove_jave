package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji sakriva uneti password..
//        Primer izvrsenja:
//        Unestite password: OvoJePassword123
//        Skriverni password: ****************
        System.out.println("Unesite password:");
        String password = s.next();
        System.out.print("Skriveni password je: ");
        for (int i = 1; i <= password.length(); i++) {
            System.out.print("*");
        }


    }
}
