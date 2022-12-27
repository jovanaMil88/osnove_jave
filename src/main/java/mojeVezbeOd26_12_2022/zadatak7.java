package mojeVezbeOd26_12_2022;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*Napisati main program koji koristi metodu definisanu u 6.zad
        tako da stampa sledecu sliku za M. M unosi korisnik.


Primer izvrsenja:
Unesite M: 6
*
* *
* * *
* * * *
* * * * *
* * * * * *
         */

        System.out.println("Unesite n: ");
        int n = s.nextInt();
        for (int i = 0; i <= n ; i++) {
            zvezdice(i);
        }




    }
    public static void zvezdice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");

    }}