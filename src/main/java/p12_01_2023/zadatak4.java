package p12_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();
//        Sastojak brasno = new Sastojak("Brašno", 90.0);
//        Sastojak secer = new Sastojak("Secer", 80.0);
//        Sastojak pirinac = new Sastojak("Pirinac", 60.0);
//        sastojci.add(brasno);
//        sastojci.add(secer);
//        sastojci.add(pirinac);
//        for (int i = 0; i < sastojci.size(); i++) {
//            System.out.println(sastojci.get(i).getNaziv() + " " + sastojci.get(i).getCena());
//        }
        System.out.println("Unesite n: ");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite naziv: ");
            String naziv = s.next();
            System.out.println("Unesite cenu: ");
            int cena = s.nextInt();
            Sastojak sastojak = new Sastojak(naziv, cena);
            sastojci.add(sastojak);
        }

        }

    }

