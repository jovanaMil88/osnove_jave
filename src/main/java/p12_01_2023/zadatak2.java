package p12_01_2023;

public class zadatak2 {
    public static void main(String[] args) {
        FizickoLice kupac = new FizickoLice("Marko Markovic", "254542",
                "545433", true);
        FizickoLice prodavac = new FizickoLice("Jovan Jovanovic", "65465464",
                "65454", false);
        Ugovor ugovor = new Ugovor("12.01.2023.", prodavac, kupac,
                68000, "Karadjordjeva 12");
        ugovor.stampaj();
    }
}
