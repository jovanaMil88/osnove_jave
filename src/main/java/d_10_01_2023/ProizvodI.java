package d_10_01_2023;

public class ProizvodI {
    private String sifra;
    private String naziv;
    private double cenaPoKg;

    public ProizvodI(String sifra, String naziv, double cenaPoKg) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaPoKg = cenaPoKg;
    }

    public String getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setCenaPoKg(double cenaPoKg) {
        this.cenaPoKg = cenaPoKg;
    }
    public double getCenaKg(){
        return this.cenaPoKg;
    }
    public double getCenaLb(){
//        konverzija: 1 kg = 2.2046 lb
        double cenaLb = 2.0246 * getCenaKg();
        return cenaLb;
    }
    public void stampaj(){
        System.out.println(this.naziv + " - " + this.sifra );
    }
}
