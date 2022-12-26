package p26_12_2022;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati metodu stampajApsolutnuVrednost,
//                koja stampa apsolutnu vrednost   prosledjene vrednosti.
apsolutna(12);
apsolutna(-14);

    }
    public  static void apsolutna (int broj) {
        if (broj < 0) {
            System.out.println("apsolutna vrednost: " + (-1 * broj));
        }else if (broj > 0){
            System.out.println("apsolutna vrednost: "  + broj);
        }
    }

}
