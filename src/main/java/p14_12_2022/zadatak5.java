package p14_12_2022;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ucitava brojeve a, b i c sa tastature i
//        proverava da li je broj a u opsegu od b do c.Primer izvrsenja:
//        Unesite b: 5
//        Uneiste c: 50
//        Unesite a: 15
//        A je u opstegu izmedju 5 i 50
//        Primer izvrsenja 2:
//        Unesite b: 5
//        Uneiste c: 50
//        Unesite a: 3
//        A nije u opstegu izmedju 5 i 50
        System.out.println("Unestite b: ");
        int b = s.nextInt();
        System.out.println("Unestite c: ");
        int c = s.nextInt();
        System.out.println("Unestite a: ");
        int a = s.nextInt();

        if (a < c && a > b ) {
            System.out.println("A je u opstegu izmedju " + b + "i " + c);
        } else {
            System.out.println("A nije u opsegu izmedju " + b + "i " + c);
        }


        }





    }

