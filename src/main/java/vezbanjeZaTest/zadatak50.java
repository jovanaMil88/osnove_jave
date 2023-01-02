package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak50 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati metodu stampajApsolutnuVrednost,
//                koja stampa apsolutnu vrednost   prosledjene vrednosti.
        stampajAPS(-9);
        stampajAPS(8);




    }
    public static void stampajAPS(int broj){
        if (broj < 0) {
            System.out.println("apsolutna vrednost je " + -broj);
        }else if (broj > 0) {
            System.out.println("apsolutna vrednost je " + broj);
        }else {
            System.out.println("Nema apsolutne vrednosti.");
            }
        }
    }

