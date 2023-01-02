package d_21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//  Napisati program koji ucitava niz A duzine N,
//  i koji nakon unosa niz A stampa sve elemente niza koji su veci od nule.
//  Primer izvrsenja:
//  Unesite N: 5
//  Unesite broj: 1
//  Unesite broj: -4
//  Unesite broj: 3
//  Unesite broj: -7
//  Unesite broj: 9
//  Brojevi veci od nule u nizu A su: 1, 3, 9,
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            brojevi.add(broj);}
        System.out.print("Brojevi veci od nule u  nizu su ");
        for (int i = 0; i < brojevi.size(); i++) {
            if(brojevi.get(i) > 0){
                System.out.print(brojevi.get(i) + ", ");

        }

        }

    }
}
