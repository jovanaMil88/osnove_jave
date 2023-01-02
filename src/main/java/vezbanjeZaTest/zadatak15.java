package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//       Napisati program koji ucitava dimenziju table i stampa je na ekranu.
//       Primer izvrsenja:
//       Unesite dimenziju table: 5
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
//                _|_|_|_|_|
        System.out.println("Unesite dimenziju table: ");
        int dimenzija = s.nextInt();
        for (int i = 0; i < dimenzija; i++) {
            System.out.println();
            for (int j = 0; j < dimenzija; j++) {
                System.out.print("_|");
            }
        }





    }

}
