package p16_12_2022;

import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ceo broj a 1 - 10: ");
        int a = s.nextInt();
        System.out.println("Unesite ceo broj b 1 - 10: ");
        int b = s.nextInt();

        for (int i = 1; i < 10; i++) {
            if (i != a && i != b) {
                System.out.print(i + ", ");
            }


        }
    }}
