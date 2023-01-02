package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak56 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati funkciju koja za dva jednocifrena broja
//        koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru.
//        METODA NISTA NE STAMPA.
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
        int x = novaVrednost(1, 5);
        System.out.println(x);
    }
    public static int novaVrednost (int a, int b){
        int novaVrednost = (a * 10) + b;
        return novaVrednost;
    }
}
