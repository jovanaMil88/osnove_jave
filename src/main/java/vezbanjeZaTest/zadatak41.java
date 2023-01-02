package vezbanjeZaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak41 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati progam koji stampa niz u obrnutom redosledu
//        tj. od zadnjeg elementa do nultog.
//                Ako je niz 1,2,4,5,7, stampa se 7,5,4,2,1
        ArrayList<Integer> brojevi = new ArrayList<Integer>();
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);
        brojevi.add(60);
        brojevi.add(70);
        brojevi.add(80);
        brojevi.add(90);
        brojevi.add(100);

        for (int i = brojevi.size() - 1; i >= 0 ; i--) {
            System.out.print(brojevi.get(i) + ", ");

        }


    }
}
