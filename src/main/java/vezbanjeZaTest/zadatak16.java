package vezbanjeZaTest;

import java.util.Scanner;

public class zadatak16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        Napisati program koji sumira parne brojeve od 1 do 50 i na kraju programa ispisuje sumu.
int suma = 0;
        for (int i = 1; i <= 50; i++) {
            if(i % 2 ==0){
                suma = suma + i;
            }
        }
        System.out.println("Suma je " + suma);
    }

}
