package mojeVezbeOd20_12_2022_2put;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//                 Napisati program koji radi bipovanje ruznih reci.
//                 Program radi za jednu recenicu, sto znaci da ucitava od korisnika
//        rec po rec sve dok se ne unese rec sa tackom. Za reci koje su nepristojne
//        ispisuje beeeeeeeeeeeeep.
//                Ruzne reci koje program prepoznaje su:
//        zajebava
//                mars
//        stoko
//                svinjo
//        Unesite rec: Jel
//                Jel
//        Unesite rec:ti
//                ti
//        Unesite rec:to
//                to
//        Unesite rec:mene
//                mene
//        Unesite rec:zajebavas
//                beeeeeeeeeep
//        Unesite rec:stoko
//                beeeeeeeeeep
//        Unesite rec:jedna.
//                jedna.
//                Kraj programa.
        String rec = "nekaRec";
        while (!rec.contains(".")) {
            System.out.print("Uneste reč: ");
            rec = s.next();
            if (rec.equals("zajebava") || rec.equals("mars") ||
                    rec.equals("stoko") || rec.equals("svinjo")) {
                System.out.println("beeeeeep");
            } else {
                System.out.println(rec);
            }
        }
        System.out.println("Kraj programa.");

    }
}
