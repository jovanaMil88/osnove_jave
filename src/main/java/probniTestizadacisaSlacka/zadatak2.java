package probniTestizadacisaSlacka;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji učitava brojeve od korisnika dok ne unese dve nule zaredom.
//                Na kraju programa ispisati sumu unetih brojeva.
//        Primer izvršenja 1:
//        Unesite broj: 1
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 5
//        Unesite broj: 9
//        Unesite broj: 0
//        Unesite broj: 0
//        Suma je 19

        int suma = 0;
        int counter = 0;
        while(counter < 2){
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if (broj == 0){
                counter++;
            } else {
                counter = 0;
            }
            suma = suma + broj;
        }
        System.out.println("Suma je " + suma);
    }
}
