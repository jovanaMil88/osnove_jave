package p19_12_2022;

import java.util.Scanner;

public class zadatak12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n = s.nextInt();
        int jacina = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite password: ");
            String pass = s.next();
             if (pass.length() <= 8 && !pass.contains("@")) {
                 jacina = 0;
             } else if(pass.length() >= 8 || pass.contains("@")) {
                 jacina = 1;
             }else if (pass.length() >= 8 && pass.contains("@")) {
                 jacina = 2;
             }

             }
        System.out.println("Password ima " + jacina + " bodova");

             }

             }




