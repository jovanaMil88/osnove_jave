package java_test;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati metodu koja radi pakovanje nekog teksta u HTML elemente.
//        Metoda kao parametar prima tekst i tip, a vraca HTML element (String)
//        sa proslednjenim tekstom.
//                Metoda podrzava sledece tipove:
//        bold, metoda pakuje tekst u <b>prosledjen tekst</b>
//                italic, metoda pakuje tekst u <em>proslednjen tekst</em>
//                paragraph, metoda pakuje tekst u <p>prosledjen tekst</p>
//                Ukoliko se prosledi tip koji nije podrzan, vraca se neupakovan tekst
//        tj. vraca se nakav kakav je dosao umetodu
//
//        U glavnom programu koristeci kreiranu metodu napisati porogram koji prikazuje sledeci tekst.
//<b>Ovaj deo je bold</b>, a <em>ovo je italic</em>
//<p>Naravno samo je falio paragraf</p>
//        String novi = tipovi("Ovo je tekst", "bold");
//        System.out.println(novi);

        System.out.print(tipovi("Ovaj deo je bold", "bold"));
        System.out.print(tipovi(", a ", "nesto"));
        System.out.println(tipovi("ovo je italic", "italic"));
        System.out.print(tipovi("Naravno samo je falio paragraf", "paragraph"));

    }

    public static String tipovi(String tekst, String tip) {
        String proba = "eto";
        if (tip.equals("bold")) {
            proba = "<b> " + tekst + " </b>";
        } else if (tip.equals("italic")) {
            proba = "<em> " + tekst + " </em>";
        } else if (tip.equals("paragraph")) {
            proba = "<p> " + tekst + " </p>";
        } else {
            proba = tekst;
        }
            return proba;
        }


    }
