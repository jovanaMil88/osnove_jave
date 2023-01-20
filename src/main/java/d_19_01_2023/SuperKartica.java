package d_19_01_2023;

public class SuperKartica {
//    broj kartice
//    ime i prezime vlasnika
//    popust (200, 500, … )
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere

    private String brKartice;
    private String vlasnik;
    private int popust;

    public SuperKartica(String brKartice, String vlasnik, int popust) {
        this.brKartice = brKartice;
        this.vlasnik = vlasnik;
        this.popust = popust;
    }

    public SuperKartica() {
    }

    public String getBrKartice() {
        return brKartice;
    }

    public void setBrKartice(String brKartice) {
        this.brKartice = brKartice;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    //    metodu stampaj koja stampa karticu u formatu:
//            (broj kartice), (ime i prezime)
    public void stampaj(){
        System.out.println("br.kartice: " + this.brKartice + ", vlasink: " + this.vlasnik);
    }
}
