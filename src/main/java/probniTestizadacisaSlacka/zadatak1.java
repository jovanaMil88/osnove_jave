package probniTestizadacisaSlacka;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite tezinu osobe: ");
        double tezinaKg = s.nextDouble();
        System.out.println("Unesite visinu: ");
        double visinaM = s.nextDouble();
        double bmi = tezinaKg / visinaM;

        if (bmi < 18.5){
            System.out.println("Neuhranjenost.");
        } else if (bmi > 18.5 && bmi < 24.99) {
            System.out.println("Normalna tezina. ");
        } else if (bmi > 25 && bmi < 29.99) {
            System.out.println("Prekomerna tezina.");
        } else if (bmi >= 30) {
            System.out.println("Gojaznost.");
        }
    }
}
