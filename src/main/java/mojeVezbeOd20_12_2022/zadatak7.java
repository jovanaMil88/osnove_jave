package mojeVezbeOd20_12_2022;

import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji sabira brojeve koje korisnik unosi,
//        pritom da suma ne predje 100.Na kraju programa ispisati sracunatu sumu.
//        Unesite vrednost: 20
//        Unesite vrednost: 50
//        Unesite vrednost: 50
//        Prekoracenje! Kraj programa. Sracunata suma je 70.
        int suma = 0;
        System.out.println("Unesite broj: ");
        int broj = s.nextInt();
        while (suma + broj < 100){
            suma = suma + broj;
            System.out.println("Unesite broj: ");
            broj = s.nextInt();
            }
            System.out.println("Prekoracenje. Kraj. Suma je " + suma);

        }


    }

