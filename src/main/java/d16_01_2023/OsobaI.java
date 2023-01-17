package d16_01_2023;

public class OsobaI {
    protected String imeIPrezime;
    protected String jmbg;
    protected int godRodjenja;

    public OsobaI() {
    }

    public OsobaI(String imeIPrezime, String jmbg, int godRodjenja) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;
    }

 /*metodu stampaj koja stampa u formatu:
            (ime i prezime), (jmbg), (godina rodjenja)*/

    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + this.godRodjenja + ", " +
                this.jmbg);
}
}
