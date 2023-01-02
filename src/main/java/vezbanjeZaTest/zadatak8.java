package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak8 {
    public static void main(String[] args) {
//        Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2 i deljiv sa 3.
//        Upoznajte se sa opertorom moduo % dok ne dodjemo do tog operatora.
//
//        HINT: Broj B je deljiv brojem A ukoliko je ostatak pri deljenju sa A jedan nuli.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi broj: ");
        int broj = s.nextInt();

        if (broj % 2 == 0 && broj % 3 == 0) {
            System.out.println("Broj je deljiv i sa 2 i sa 3.");
        }else if (broj % 2 == 0) {
            System.out.println("Broj je deljiv sa 2.");
        } else if (broj % 3 == 0) {
            System.out.println("Broj je deljiv sa 3.");
        }else{
                System.out.println("Broj nije deljiv ni sa 2 ni sa 3.");

        }
    }
        }




