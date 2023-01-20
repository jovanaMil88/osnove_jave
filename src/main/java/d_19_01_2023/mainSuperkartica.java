package d_19_01_2023;

public class mainSuperkartica {
    public static void main(String[] args) {
//        U glavnom programu kreirati jednu Korpu
//        i u nju dodati nekoliko Ambalaza razlicitih tipova
//        i istestirati sve metode i ispisati ukupnu cenu sa popustom.
        Korpa k = new Korpa();
        k.dodajAmbalazu(new Tetrapak("454654", "Mleko",
                1000,1050,true,100));
        k.dodajAmbalazu(new StaklenaAmbalaza("55654546", "Sok od paradajza",
                1000, 1600,0,false, 170));
        k.dodajAmbalazu(new Tetrapak("787666", "So",
                500, 520,false, 90));
        k.dodajAmbalazu(new StaklenaAmbalaza("2132465", "Pivo",
                500,700,30,true,70));
        SuperKartica kartica = new SuperKartica("545453", "Marko Markovic",
                20);
        kartica.stampaj();
        k.stampaj();
        System.out.println("Ukupna cena ove korpe je: " + k.UkupnaCenaKorpe(kartica));
        k.izbaciAmbalazu("2132465");
        k.stampaj();
        System.out.println("Ukupna cena ove korpe je: " + k.UkupnaCenaKorpe(kartica));



    }
}
