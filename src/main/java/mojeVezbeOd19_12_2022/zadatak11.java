package mojeVezbeOd19_12_2022;

import java.util.Scanner;

public class zadatak11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji sakriva uneti password..
//        Primer izvrsenja:
//        Unestite password: OvoJePassword123
//        Skriverni password: ****************
        System.out.println("Unesite password: ");
        String pass = s.next();
        int duzina = pass.length();
        for (int i = 0; i < duzina ; i++) {
            System.out.print("*");
        }

        }



    }

