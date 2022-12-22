package p21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class uvodNiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<String> cars = new ArrayList<String>();
        System.out.println(cars.size());
        cars.add("Volvo");
        System.out.println(cars.size());
        cars.add("BMW");
        System.out.println(cars.size());
        cars.add("Ford");
        System.out.println(cars.size());
        cars.add("Mazda");
        System.out.println(cars.size());
String prvi = cars.get(1);
        System.out.println(prvi);
        cars.set(0, "Audi");
        cars.add(2, "Bla");

    }
}
