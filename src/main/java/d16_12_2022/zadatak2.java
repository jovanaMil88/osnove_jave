package d16_12_2022;

import java.util.Scanner;

public class zadatak2 {
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
        for (int i = 1; i < 6; i++) {
            System.out.println("_ _ _ _ _");
            if(i == 5) {
                System.out.println();
            }
            }

        }


    }

