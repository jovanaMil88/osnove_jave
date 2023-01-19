package mojeVezbe13_01_2023;

public class zadatakInstagram {
    public static void main(String[] args) {
        InstagramUser korisnik1 = new InstagramUser("jovana88",
                "Jovana Milojevic", "jovanastevanovic@gmail.com");
        InstagramUser korisnik2 = new InstagramUser("jovana88",
                "Jovana Milojevic", "jovanastevanovic@gmail.com");
        InstagramUser korisnik3 = new InstagramUser("jovana88",
                "Jovana Milojevic", "jovanastevanovic@gmail.com");
        InstagramUser korisnik4 = new InstagramUser("jovana88",
                "Jovana Milojevic", "jovanastevanovic@gmail.com");
        InstagramTag tag1 = new InstagramTag(3.4,7.2,korisnik1);
        InstagramTag tag2 = new InstagramTag(3.6,7.8,korisnik2);
        InstagramTag tag3 = new InstagramTag(3.0,7.0,korisnik3);
        InstagramTag tag4 = new InstagramTag(4,7.7,korisnik4);

        InstagramImage slika1 = new InstagramImage("5x10",
                "instagram.com/korsnik-pera/profilna1.jpg");
        InstagramImage slika2 = new InstagramImage("5x10",
                "instagram.com/korsnik-pera/profilna1.jpg");
        InstagramImage slika3 = new InstagramImage("5x10",
                "instagram.com/korsnik-pera/profilna1.jpg");
        InstagramImage slika4 = new InstagramImage("5x10",
                "instagram.com/korsnik-pera/profilna1.jpg");
        slika1.dodajTag(tag1);
        slika1.dodajTag(tag2);
        slika2.dodajTag(tag3);
        slika4.dodajTag(tag4);
        InstagramPost post1 = new InstagramPost("Poyy!");
        post1.dodajSliku(slika1);
        InstagramPost post2 = new InstagramPost("Pozz!");
        post1.dodajSliku(slika2);
        post2.dodajSliku(slika4);
        post2.dodajSliku(slika3);
        post1.stampaj();
        System.out.println();
        post2.stampaj();





    }
}
