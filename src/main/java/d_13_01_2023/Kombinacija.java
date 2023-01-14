package d_13_01_2023;

import java.util.ArrayList;
//        id kombinacije (String)
//        niz brojeva - niz je od 7 broja (ArrayList<Integer>)

public class Kombinacija {
    private String id;
    private ArrayList<Integer> brojevi;


//    konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.

    public Kombinacija(String id, int a, int b, int c, int d, int e, int f, int g) {
        this.id = id;
        this.brojevi = new ArrayList<Integer>();
        this.brojevi.add(a);
        this.brojevi.add(b);
        this.brojevi.add(c);
        this.brojevi.add(d);
        this.brojevi.add(e);
        this.brojevi.add(f);
        this.brojevi.add(g);
    }

    public String getId() {
        return id;
    }


    public ArrayList<Integer> getBrojevi() {
        return brojevi;
    }

    public boolean daLiJeIstaKombinacija(Kombinacija k) {
        int counter = 0;
        for (int i = 0; i < this.brojevi.size(); i++) {
            if (this.brojevi.get(i) == k.brojevi.get(i)) {
                counter++;
            }
            if (counter == 7) {
                return true;
            }
        }
        return false;
    }
    //    metodu za stampu koja stampa podatke u formatu
//    ID: id kombinacije
//    brojevi: 1, 3, 5, 14, 15, 21, 23

    public void stampaj() {
        System.out.println("ID: " + this.id);
        System.out.println("brojevi: ");
        for (int i = 0; i < this.brojevi.size(); i++) {
            System.out.print(this.brojevi.get(i) + ", ");


        }
    }
}