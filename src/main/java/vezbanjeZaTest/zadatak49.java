package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak49 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati funkciju koja stampa zbir, razliku, proizvod i kolicnik za dva prosledjena broja.
//        Brojevi su ulazni parametri funkcije. U gravnom programu pozvati nekoliko puta funkciju
//        sa razlicitim prosledjenim vrednostima.
operacije(7,8);
operacije(1,6);
operacije(12,10);

    }
    public static void operacije (int a, int b){
        int suma = a + b;
        int razlika = a - b;
        int proizvod = a * b;
        int kolicnik = a / b;


    }
}
