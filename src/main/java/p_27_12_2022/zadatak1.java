package p_27_12_2022;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Kreirati klasu Racun koja ima
////		broj racuna (npr: 840-23932-323)
////		ime i prezime vlasnika
////		stanje na racunu
////		U mainu kreirati minimum dva racuna sa pratecim podacima
////		i ostampati podatke za svaki objekat.
        Racun jovanaMilojevic = new Racun();
        jovanaMilojevic.brojRacuna = "2124-6546-1212-4445";
        jovanaMilojevic.imeIprezimeVlasnika = "Jovana Milojevic";
        jovanaMilojevic.stanjeNaRacunu = 51000;
        System.out.println(jovanaMilojevic.brojRacuna);
        System.out.println(jovanaMilojevic.imeIprezimeVlasnika);
        System.out.println(jovanaMilojevic.stanjeNaRacunu);
        System.out.println(" ");
        Racun markoMarkovic = new Racun();
        markoMarkovic.brojRacuna = "5454-1226-2121-5155";
        markoMarkovic.imeIprezimeVlasnika ="Marko Markovic";
        markoMarkovic.stanjeNaRacunu = 21000;
        System.out.println(markoMarkovic.brojRacuna);
        System.out.println(markoMarkovic.imeIprezimeVlasnika);
        System.out.println(markoMarkovic.stanjeNaRacunu);

//        Primer izvrsenja:
//        Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 1000
//        Primalac: Marko Markovic, 840-23932-334, stanje: 200
//        Unesite sumu za transakciju: 500
//        Stanje nakon stransakcije
//        Posaljilac: Milan Jovanovic, 840-23932-323, stanje: 500
//        Primalac: Marko Markovic, 840-23932-334, stanje: 700
        System.out.println(" ");
        System.out.print("Posiljalac: " +
                jovanaMilojevic.imeIprezimeVlasnika + ", " + jovanaMilojevic.brojRacuna
                + " stanje: " + jovanaMilojevic.stanjeNaRacunu);
        System.out.println(" ");
        System.out.print("Primalac: " + markoMarkovic.imeIprezimeVlasnika +
                ", " + markoMarkovic.brojRacuna + ", " + markoMarkovic.stanjeNaRacunu);
        System.out.println(" ");
        System.out.println("Unesite sumu za transakciju: ");
        int suma = s.nextInt();
        System.out.println("Stanje nakon transakcije:");
        jovanaMilojevic.stanjeNaRacunu = jovanaMilojevic.stanjeNaRacunu - suma;
        markoMarkovic.stanjeNaRacunu = markoMarkovic.stanjeNaRacunu + suma;


        System.out.println("Posiljalac: " + jovanaMilojevic.imeIprezimeVlasnika + ", "
                + jovanaMilojevic.brojRacuna
                + " stanje: " + jovanaMilojevic.stanjeNaRacunu);
        System.out.println("Primalac: " + markoMarkovic.imeIprezimeVlasnika + ", "
                + markoMarkovic.brojRacuna
                + " stanje: " + markoMarkovic.stanjeNaRacunu);



    }
}
