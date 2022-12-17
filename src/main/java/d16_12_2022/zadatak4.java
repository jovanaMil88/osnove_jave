package d16_12_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        (Za vezbanje) Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//                Primer izvrsenja:
//        Unesite dimenziju table: 5
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
//
//                Primver izvrsenja 2:
//        Unesite dimenziju table: 7
//                _|_|_|_|_|_|_|
//                _|_|_|_|_|_|_|
//                _|_|_|_|_|_|_|
//                _|_|_|_|_|_|_|
//                _|_|_|_|_|_|_|
//                _|_|_|_|_|_|_|
//                _|_|_|_|_|_|_|
        System.out.println("Unesite dimenziju table: ");
        int x = s.nextInt();
        for (int i = 1; i <= x * 2; i++) {
            if(i % 2 == 0) {
                System.out.print("|");
            }else{
                System.out.print("_");}

            }

        }



            }





