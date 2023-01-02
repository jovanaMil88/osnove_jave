package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak52 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
//                Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//        Primer: Ako se metoda pozove za N=10, vraca -10
//        Ako se metoda pozove za N=-11, vraca 11

        int noviBroj = vratiSuprotno(15);
        System.out.println(noviBroj);
    }
    public static int vratiSuprotno(int broj){
        if (broj < 0){
            return -broj;
        } else if (broj > 0) {
            return broj * -1;
        }else{
            return 0;
        }
    }
}
