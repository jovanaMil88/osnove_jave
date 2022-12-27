package mojeVezbeOd26_12_2022;

public class zadatak5 {
    public static void main(String[] args) {
       /* Napisati metodu stampajApsolutnuVrednost, koja stampa apsolutnu vrednost
        prosledjene vrednosti.*/
        apsolutnaVred(13);
        apsolutnaVred(-14);
    }

    public static void apsolutnaVred(int broj) {
        if (broj > 0) {
            System.out.println("Apsolutna vrednost je " + broj);
        } else if (broj < 0) {
            System.out.println("Apsolutna vrednost je " + (-broj));
        }
    }
}
