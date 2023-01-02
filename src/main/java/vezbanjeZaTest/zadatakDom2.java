package vezbanjeZaTest;

import java.util.Scanner;

public class zadatakDom2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Napisati program koji ispisuje SAMO PARNE brojeve od 1 do 100

        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }


    }
}
