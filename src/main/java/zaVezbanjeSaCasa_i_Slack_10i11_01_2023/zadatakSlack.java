package zaVezbanjeSaCasa_i_Slack_10i11_01_2023;

public class zadatakSlack {
    public static void main(String[] args) {
        Osoba mama = new Osoba("Dragica Stevanovic");
        Osoba tata = new Osoba("Tomislav Stevanovic");
        Osoba ja = new Osoba("Jovana Milojevic");
        ja.setMajka(mama);
        ja.setOtac(tata);
        ja.stampaj();








    }
}
