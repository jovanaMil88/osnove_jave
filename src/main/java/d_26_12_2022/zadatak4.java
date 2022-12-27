package d_26_12_2022;

public class zadatak4 {
    public static void main(String[] args) {
        /*Napisati metodu koja stampa podatke o korisniku u formatu:
        JMBG: [jmbg]
        Ime: [ime]
        Prezime: [prezime]
        God. rodjenja: [god]
        Aktivan: [true/false]
        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
                Metoda nista ne vraca.

         */
        stampajPodatke("896778585","Jovana", "Milojevic", "1988", true);


    }
    public static void stampajPodatke
            (String jmbg, String ime, String prezime, String godRodj, boolean jeAktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God.rođenja: " + godRodj);
        System.out.println("Aktivan: " + jeAktivan);
    }
}
