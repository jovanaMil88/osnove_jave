package d16_01_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Igrac> igraci = new ArrayList<Igrac>();
        ArrayList<Trener> treneri = new ArrayList<Trener>();
        Igrac prviIgrac = new Igrac("Marko Markovic", "89798798798",
                1989, 7, "NAPADAC", false);
        Igrac drugiIgrac = new Igrac();
        drugiIgrac.setJmbg("38947928374");
        drugiIgrac.setImeIPrezime("Pavle Pavlovic");
        drugiIgrac.setGodRodjenja(1995);
        drugiIgrac.setBroj(3);
        drugiIgrac.setPozicija("ODBRAMBENI");
        drugiIgrac.setJeKapiten(true);
        prviIgrac.stampaj();
        drugiIgrac.stampaj();

        Trener prviTrener = new Trener("Nikola Nikolic",
                "198768678", 1978,10, "KONDICIONI");
        prviTrener.setJmbg("90845879");
        Trener drugiTrener = new Trener("Dejan Pantelic", "97979797",
                1965, 20, "ZA IGRU");
        drugiTrener.setJmbg("7867868");
        prviTrener.stampaj();
        drugiTrener.stampaj();

        /*dopuna:
        (Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera,
        na kraju programa ispisati sve igrace i trenere.
        Podatke za igrace i trenere unosi korisnik sa tastature.
         */
        System.out.println("Unesite broj igraca: ");
        int broj = s.nextInt();
        for (int i = 0; i < broj; i++) {
            System.out.println("Unesite ime i prezime igraca: ");
            String imeIPrezime = s.next();
            System.out.println("Unesite jmbg: ");
            String jmbg = s.next();
            System.out.println("unesite godinu rodjenja: ");
            int godina = s.nextInt();
            System.out.println("Unesite broj dresa: ");
            int brojDresa = s.nextInt();
            System.out.println("Unesite poziciju na kojoj igra: ");
            String pozicija = s.next();
            System.out.println("Da li je kapiten? (true/false");
            boolean kapiten = s.nextBoolean();
            Igrac igrac = new Igrac(imeIPrezime,jmbg,godina,brojDresa,pozicija, kapiten);
            igraci.add(igrac);
            igrac.stampaj();
        }

        System.out.println("Unesite broj trenera: ");
        int tbrTrenera = s.nextInt();
        for (int i = 0; i < tbrTrenera; i++) {
            System.out.println("Unesite ime i prezime trenera: ");
            String imeIPrezime = s.next();
            System.out.println("Unesite jmbg: ");
            String jmbg = s.next();
            System.out.println("unesite godinu rodjenja: ");
            int godina = s.nextInt();
            System.out.println("Unesite broj godina iskustva: ");
            int iskustvo = s.nextInt();
            System.out.println("Unesite tip trenera: ");
            String tip = s.next();
            Trener trener = new Trener(imeIPrezime, jmbg,godina,iskustvo,tip);
            treneri.add(trener);
            trener.stampaj();
        }



    }}