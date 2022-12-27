package d_26_12_2022;

import java.util.Scanner;

public class zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       /* Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

        */
       int z = najmanjiBroj(13, 6, 9);
        System.out.println("Najmanji broj je " + z);
    }

    public static int najmanjiBroj(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b) {
            return c;
        } else {
            return 0;
        }
    }

}
