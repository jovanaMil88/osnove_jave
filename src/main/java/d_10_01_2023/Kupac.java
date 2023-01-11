package d_10_01_2023;

public class Kupac {
    private String imeIPrezime;
    private ClanskaKarta ck;

    public Kupac(String imeIPrezime, ClanskaKarta ck) {
        this.imeIPrezime = imeIPrezime;
        this.ck = ck;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public ClanskaKarta getCk() {
        return ck;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime + " - " + this.getCk().getBrKartice());
    }
}


