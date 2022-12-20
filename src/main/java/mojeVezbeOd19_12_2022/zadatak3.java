package mojeVezbeOd19_12_2022;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
        Izvrsenje:
        2 na stepen 7 je 128*/
        int stepen= 2;
        for (int i = 1; i < 7; i++) {
            stepen = stepen * 2;

        }
        System.out.println("2 na 7. stepen je: " + stepen);
    }
}
