package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak55 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
//                Metoda od parametara prima ime i prezime (2 parametra)
//        i vraca jedan string tako sto spoji ime i prezime. METODA NISTA NE STAMPA.
//        Primer poziva: Ako se metoda pozvoe za ime=”Milan” i prezime=”Jovanovic”,
//        metoda vraca “Milan Jovanovic”
        String imeIPrezime = imeIPrezime("Jovana","Milojevic");
        System.out.println(imeIPrezime);

    }
    public static String imeIPrezime (String ime, String prezime){
        return ime.concat(" ").concat(prezime);
    }
}
