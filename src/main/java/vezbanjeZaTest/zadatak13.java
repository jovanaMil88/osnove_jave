package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji stampa 25 _ (donjih crta),
//            pritom na svaku 5. iteraciju odstampa i novi red.
//                Zadatak resiti pomocu FOR petlje.
//                Primer izvrsenja:
//        _ _ _ _ _
//        _ _ _ _ _
//        _ _ _ _ _
//        _ _ _ _ _
//        _ _ _ _ _
        for (int i = 0; i < 5; i++) {

            System.out.println(" ");
            for (int j = 0; j < 5; j++) {
                System.out.print("_ ");
            }
        }


    }

}
