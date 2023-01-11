package d_10_01_2023;

public class Proizvod {
    private String naziv;
    private Kupac k;
    private double cenaIzrade;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCenaIzrade() {
        return cenaIzrade;
    }

    public void setCenaIzrade(double cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Proizvod(String naziv, Kupac k, double cenaIzrade) {
        this.naziv = naziv;
        this.k = k;
        this.cenaIzrade = cenaIzrade;
    }

    public Kupac getK() {
        return k;
    }

    public double cenaProizvoda(){
//        cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
double cenaProizvoda = this.cenaIzrade * 1.9 * (100 - this.k.getCk().getPopust()) / 100;
return cenaProizvoda;
    }
    public void stampaj(){
        System.out.println(this.naziv + " - " + this.cenaProizvoda());
    }
}

