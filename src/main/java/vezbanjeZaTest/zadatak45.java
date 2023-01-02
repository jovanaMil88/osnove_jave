package vezbanjeZaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak45 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ucitava niz stringova duzine N,
//        tako da ucitavanje elemenata u niz a bude obrnuto.
//        Primer:
//        Unesite N: 4
//        Unesite string: xxx1
//        Unesite string: xxx4
//        Unesite string: xxx6
//        Unesite string: xxx9
//
//        Niz a: xxx9, xxx6, xxx4, xxx1
//        Komentar: Stanje niza a u memoriji je:
//                a[0]="xxx9",
//                a[1]="xxx6",
//                a[2]="xxx4",
//                a[3]="xxx1",
        ArrayList<String>stringovi = new ArrayList<>();
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite string: ");
            String string = s.next();
            stringovi.add(0, string);
        }
        System.out.print("Niz je : ");
        for (int i = 0; i < stringovi.size(); i++) {
            System.out.print(stringovi.get(i) + ", ");
        }

        }
        }



