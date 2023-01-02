package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak48 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati metodu koja stampa zvezdicu sa razmakom.
//                U glavnom programu je potrebno odstampati sledecu sliku
//        koristeci metode koje smo definisali.
//*  *  *
//*  *
//*
stampajZvezdicu();stampajZvezdicu();stampajZvezdicu();
        System.out.println();
        stampajZvezdicu();stampajZvezdicu();
        System.out.println();
        stampajZvezdicu();

    }
    public static void stampajZvezdicu(){
        System.out.print("* ");
    }
}
