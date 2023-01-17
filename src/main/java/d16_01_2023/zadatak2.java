package d16_01_2023;

public class zadatak2 {
    public static void main(String[] args) {
        IgracI proba = new IgracI("Mirko Mirkovic",
                "824799182477", 1987, 6,
                "Golman", true);
        proba.dodajKarton(new Karton("zuti"));
        proba.dodajKarton(new Karton("crveni"));
        proba.dodajKarton(new Karton("zuti"));
        proba.dodajKarton(new Karton("zuti"));
        proba.dodajKarton(new Karton("zuti"));
        proba.stampaj();
    }
}
