package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak57 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja
//        i da li je aktivan kao parametre metode.Metoda nista ne vraca.
        stampaj("546544464", "Jovana", "Milojevic", "1988", true);
    }
    public static void stampaj(String jmbg, String ime, String prezime,
                               String godRodj, boolean jeAktivan){
        System.out.println("jmbg: " + jmbg);
        System.out.println("ime: " + ime);
        System.out.println("prezime: " + prezime);
        System.out.println("godina rođenja: " + godRodj);
        System.out.println("aktivan: " + jeAktivan);
    }
}
