package mojeVezbe13_01_2023;

import java.util.ArrayList;

public class zadatakHistoryPage {
    public static void main(String[] args) {
        History stranice = new History();
        stranice.otvoriStranicu(new HistoryPage("Instagram",
                "https://www.instagram.com/", 12, 10));
        stranice.otvoriStranicu(new HistoryPage("Facebook",
                "https://www.facebook.com/", 14, 15));
        stranice.otvoriStranicu(new HistoryPage("Senidah najveci hitovi",
                "https://www.youtube.com/watch?v=CbWzt4oj-Fw", 15, 0));
        stranice.pogledajIstoriju();
        stranice.obrisiPremaLinku("https://www.instagram.com/");
        stranice.pogledajIstoriju();
        stranice.otvoriStranicu(new HistoryPage("Instagram",
                "https://www.instagram.com/", 16, 10));
        stranice.pogledajIstoriju();
        stranice.obrisiIstoriju();
        stranice.pogledajIstoriju();
        stranice.otvoriStranicu(new HistoryPage("Instagram",
                "https://www.instagram.com/", 12, 10));
        stranice.otvoriStranicu(new HistoryPage("Facebook",
                "https://www.facebook.com/", 14, 15));
        stranice.otvoriStranicu(new HistoryPage("Senidah najveci hitovi",
                "https://www.youtube.com/watch?v=CbWzt4oj-Fw", 15, 0));
        stranice.pogledajIstoriju();
        stranice.sacuvajKredencijale("Facebook", "jovana", "0123");
        stranice.pogledajIstoriju();
        stranice.obrisiSveKolacice();
        stranice.pogledajIstoriju();

        stranice.obrisiSveKolaciceZaSadnjihSatVremena(15, 55);
        stranice.pogledajIstoriju();
        stranice.sacuvajKredencijale("Facebook", "jovana", "0123");
        stranice.pogledajIstoriju();
        stranice.obrisiSveKolaciceZaSadnjihSatVremena(14, 50);
        stranice.pogledajIstoriju();


    }

}

