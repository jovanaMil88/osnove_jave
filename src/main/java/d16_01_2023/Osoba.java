package d16_01_2023;

public class Osoba {
    protected String imeIPrezime;
    protected String jmbg;
    protected int godRodjenja;

    public Osoba() {
    }

    public Osoba(String imeIPrezime, int godRodjenja, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }

    /* metodu stampaj koja stampa u formatu:
             (ime i prezime), (jmbg), (godina rodjenja)*/
    public void stampaj() {
        System.out.println(this.imeIPrezime + ", " + this.jmbg + ", " + this.godRodjenja);
    }
}
