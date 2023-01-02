package probniTestizadacisaSlacka;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli.
//                Program ima niz brojeva duzine 25, koji izgleda kao tabela 5x5,
//            niz je sa fiksnim vrednostima tj. ne unosi ih korisnik.
//        Program stampa tabelu na ekranu a zatim od korisnika trazi da unese kolonu
//        po kojoj bi zeleo da sumira vrednosti i na kraju programa ispisuje sumu za trazenu kolonu.
//        POGLEDAJ SLIKU
//        Primer izvrsenja:
//                3,1,8,0,1,
//                1,5,7,9,6,
//                3,1,6,5,1,
//                4,5,8,1,7,
//                1,3,2,8,0,
//                Unesite kolonu za sumiranje: 2
//        Suma je 31 (Objasnjenje: jer se sumira 8+7+6+8+2, pogledaj sliku)

        ArrayList<Integer> brojevi = new ArrayList<>();
        brojevi.add(1);
        brojevi.add(2);
        brojevi.add(3);
        brojevi.add(4);
        brojevi.add(5);
        brojevi.add(6);
        brojevi.add(7);
        brojevi.add(8);
        brojevi.add(9);
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
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(30);
        brojevi.add(40);
        brojevi.add(50);
        brojevi.add(60);

        for (int i = 0; i < 25; i++) {
            System.out.print(brojevi.get(i) + " ");
            if ((i + 1) % 5 == 0){
                System.out.println();
            }}
            System.out.println("Unesite kolonu: ");
            int kolona = s.nextInt();
            int suma = 0;
            for (int i = 0; i < 25; i+=5) {
            suma = suma +  brojevi.get(kolona + i);
            }
        System.out.println(suma);
        }




    }











