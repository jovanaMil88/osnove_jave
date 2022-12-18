package p14_12_2022;

import java.util.Scanner;

public class zadatak10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Zadatak
//        Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2
//        i deljiv sa 3.
//        HINT: Broj B je deljiv brojem A ukoliko je ostatak
//        pri deljenju sa A jedan nuli.
        System.out.println("Unesite broj:");
        int broj = s.nextInt();
        if (broj % 2 == 0) {
            System.out.println("Broj je deljiv sa 2.");
        }  else if( broj % 2 != 0){
            System.out.println("Broj nije deljiv sa 2.");
        } else if (broj % 3 == 0) {
            System.out.println("Broj je deljiv sa 3.");
        } else if (broj % 3 != 0) {
            System.out.println("Broj nije deljiv sa 3.");
        }



    }
}
