package d_26_12_2022;

public class zadatak1 {
    public static void main(String[] args) {
        /*Napisati metodu stampajVrednostZa10Vecu
        u kojoj se stampa prosledjena vrednost za 10 veca.
            Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

         */
        stampajVrednostZa10Vecu(12);
        stampajVrednostZa10Vecu(8);
        stampajVrednostZa10Vecu(3);
        stampajVrednostZa10Vecu(220);

    }
    public static void stampajVrednostZa10Vecu (int broj){
        System.out.println("Nova vrednost je: " + broj * 10);
    }
}
