package d_19_01_2023;

public abstract class Ambalaza {

//    barkod (primer: 328232-2823)
//    naziv artikla
//    neto tezinu
//    bruto tezinu
    protected String barkod;
    protected String naziv;
    protected double netoT;
    protected double brutoT;

    //    konstuktore (default-ni i sa parametrima)
//    gettere i settere
    public Ambalaza(String barkod, String naziv, double netoT, double brutoT) {
        this.barkod = barkod;
        this.naziv = naziv;
        this.netoT = netoT;
        this.brutoT = brutoT;
    }

    public Ambalaza() {
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getNetoT() {
        return netoT;
    }

    public void setNetoT(double netoT) {
        this.netoT = netoT;
    }

    public double getBrutoT() {
        return brutoT;
    }

    public void setBrutoT(double brutoT) {
        this.brutoT = brutoT;
    }
    //    metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
    public double tezina(){
        return this.brutoT - this.netoT;
    }

//    abstraktnu metodu koja vraca cenu artikla

    public abstract double cenaArtikla();
//    abstraktnu metodu stampaj
    public abstract void stampaj();
}
