package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int counter1 = 0;
        int counter2 = 0;

        while(counter1 < 3 && counter2 < 2){
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            if (broj == 1) {
                counter1 = counter1 + 1;
            } else if (broj == 2) {
                counter2 = counter2 + 1;
            }
        }
        System.out.println("kraj.");
        }

    }

