package d_19_12_2022;

import java.util.Scanner;

public class saCasa19_12_zadatak10zaVezbanje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        (Za vezbanje) Napisati program koji za sve petocifene brojeve radi mirror opciju.
//           Primer izvrsenja:
//           Unesite broj: 32492
//           Novi broj je 29423
        System.out.println("Unesi petocifreni broj n: ");
        int n = s.nextInt();
        int zadnjaCifra = 0;
        int ostatak = 0;
        for (int i = 0; i < 5; i++) {
            zadnjaCifra = n % 10;
            n = n / 10;
            System.out.print(zadnjaCifra);
        }}}

