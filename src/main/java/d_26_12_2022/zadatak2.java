package d_26_12_2022;

public class zadatak2 {
    public static void main(String[] args) {
       /* Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
                Metoda od parametara prima ime i prezime (2 parametra)
        i vraca jedan string tako sto spoji ime i prezime. METODA NISTA NE STAMPA.
        Primer poziva: Ako se metoda pozvoe za ime=”Milan” i prezime=”Jovanovic”,
        metoda vraca “Milan Jovanovic”

        */

       String rezultat = spajanje("Jovana","Milojevic");
        System.out.println(rezultat);


    }
    public static String spajanje (String ime, String prezime){
        String spoj = ime.concat(" ").concat(prezime);
        return spoj;

    }

}
