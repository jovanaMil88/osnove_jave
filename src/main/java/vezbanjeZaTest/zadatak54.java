package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak54 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
//        1 - I
//        2 - II
//        3 - III
//        4 - IV
//        5 - V
//        Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//        Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.
        int arapski = konvertuj("I");
        System.out.println("arapska cifra je " + arapski);

    }
    public static int konvertuj(String rimski){
        if (rimski.equals("I")){
            return 1;
        } else if (rimski.equals("II")) {
            return 2;
        } else if (rimski.equals("III")) {
            return 3;
        } else if (rimski.equals("IV")) {
            return 4;
        } else if (rimski.equals("V")) {
            return 5;
        }else{
            return 0;
        }
    }
}
