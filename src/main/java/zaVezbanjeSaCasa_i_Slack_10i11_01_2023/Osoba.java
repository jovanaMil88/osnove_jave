package zaVezbanjeSaCasa_i_Slack_10i11_01_2023;

public class Osoba {
    private String imeIPrezime;
    private Osoba otac;
    private Osoba majka;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public Osoba getOtac() {
        return otac;
    }

    public Osoba getMajka() {
        return majka;
    }

    public void setOtac(Osoba otac) {
        this.otac = otac;
    }

    public void setMajka(Osoba majka) {
        this.majka = majka;
    }

    public Osoba(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void stampaj(){
        System.out.println(this.imeIPrezime);
        System.out.println("Otac: " + this.getOtac().getImeIPrezime());
        System.out.println("Majka: " + this.getMajka().getImeIPrezime());
    }
}
