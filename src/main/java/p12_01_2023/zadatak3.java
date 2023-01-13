package p12_01_2023;

public class zadatak3 {
    public static void main(String[] args) {
        ViberKorisnik poslao = new ViberKorisnik("Marko Markovic",
                "062557231", true);
        ViberKorisnik primio = new ViberKorisnik("Petar Petrovic",
                "02145892", false);
        ViberPoruka poruka = new ViberPoruka("De si bre covece", "12:56",
                poslao, primio);
        ViberReakcija reakcija =new ViberReakcija(primio);
        reakcija.setEmoji("heart");
        poruka.setReakcija(reakcija);
        poruka.stampaj();


    }
}
