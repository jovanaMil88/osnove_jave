package p16_01_2023;

public class Osoba {
//    ime i prezime
//            jmbg
//    konstuktor sa parametrima
//    metodu stampaj koja stampa podatke u formatu
//    ime prezime, jmbg

    protected String imeIPrezime;
    protected String jmbg;

    public Osoba(String imeIPrezime, String jmbg) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
    }
    public void stampaj(){
        System.out.println(this.imeIPrezime + this.jmbg);
    }
}
