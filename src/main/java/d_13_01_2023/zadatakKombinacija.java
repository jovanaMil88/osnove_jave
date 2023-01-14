package d_13_01_2023;

public class zadatakKombinacija {
    public static void main(String[] args) {
        Listic probni = new Listic();
        probni.dodajKombinaciju(new Kombinacija("0001458", 12, 8, 22, 30, 41, 6, 29));
        probni.dodajKombinaciju(new Kombinacija("048965", 4, 17, 22, 37, 10, 27, 1));
        probni.dodajKombinaciju(new Kombinacija("45894", 24, 11, 15, 8, 7, 10, 26));
        probni.dodajKombinaciju(new Kombinacija("787644", 38, 11, 2, 24, 7, 9, 19));
        probni.print();
        if (probni.jeDobitna(new Kombinacija("1222", 12, 8, 22, 30, 41, 6, 29))) {
            System.out.println("Cestitam, imate dobitnu kombinaciju.");
        }else {
            System.out.println("Nije dobitna kombinacija.");
        }





    }
}