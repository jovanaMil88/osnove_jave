package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
//        Izvrsenje:
//        2 na stepen 7 je 128
//        HINT
//                P = 2 * 2 * 2 * 2 * 2 * 2 * 2
//        P = 1
//        P = P * 2
//        P = P * 2
//        P = P * 2
//        P = P * 2
//        P = P * 2
//        P = P * 2
//        P = P * 2
        int proizvod = 1;
        for (int i = 1; i <= 7; i++) {
            proizvod = proizvod * 2;
        }
        System.out.println(proizvod);
        }


    }


