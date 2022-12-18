package mojeVezbeOd_14_12_2022;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji sa tastature ucitava tri cela broja:
//        dan, mesec, godina
//        I formira datum u ispisu u formatu dan-mesec-godina
        System.out.print("Unesite ceo broj za dan: ");
        int dan = s.nextInt();
        System.out.print("Unesite ceo broj za mesec: ");
        int mesec = s.nextInt();
        System.out.print("Unesite četvorocifreni ceo broj za godinu: ");
        int godina = s.nextInt();
        System.out.print("Datum je: " + dan + "-" + mesec + "-" + godina);
    }
}
