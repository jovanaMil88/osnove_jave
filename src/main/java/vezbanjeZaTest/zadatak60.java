package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak60 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati funkciju koja za pronalazi koliko ima celih brojeve
//        izmedju brojeva M i N.
//
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
       int x = izbroji(8,12);
        System.out.println(x);

    }
    public static int izbroji (int m, int n){
        return n - m - 1;
    }
}
