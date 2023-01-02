package java_test;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite ime prva osobe: ");
        String ime1 = s.next();
        System.out.println("Unesite godinu rođenja prve osobe: ");
        int godina1 = s.nextInt();
        System.out.println("Unesite mesec rođenja prve osobe: ");
        int mesec1 = s.nextInt();
        System.out.println("Unesite dan rođenja prve osobe:");
        int dan1 = s.nextInt();
        System.out.println("Unesite ime druge osobe: ");
        String ime2 = s.next();
        System.out.println("Unesite godnu rođenja druge osobe:");
        int godina2 = s.nextInt();
        System.out.println("Unesite mesec rođenja prve osobe:");
        int mesce2 = s.nextInt();
        System.out.println("Unesite dan rođenja prve osobe:");
        int dan2 = s.nextInt();

        if (godina1 < godina2) {
            System.out.println(ime1 + " je stariji.");
        } else if (godina1 == godina2) {
            if (mesec1 < mesce2) {
                System.out.println(ime1 + " je stariji.");
            } else if (mesec1 == mesce2) {
                {
                    if (dan1 < dan2) {
                        System.out.println(ime1 + " je stariji.");
                    } else if (dan1 == dan2) {
                        System.out.println("Rođeni su u isto vreme.");
                    } else {
                        System.out.println("Straji je " + ime2);
                    }
                }
            } else {
                System.out.println("Stariji je " + ime2);
            }

        } else {
            System.out.println("Stariji je " + ime2);
        }

    }


}

