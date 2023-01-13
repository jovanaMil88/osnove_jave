package p10_01_2023;

public class Film_ {
    private String naziv;
    private int godina;
    private String reziser;
    private Reziser_ starosti;

    public void setStarosti(Reziser_ starosti) {
        this.starosti = starosti;
    }

    public Film_(String naziv, int godina, String reziser) {
        this.naziv = naziv;
        this.godina = godina;
        this.reziser = reziser;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodina() {
        return godina;
    }

    public String getReziser() {
        return reziser;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public void setReziser(String reziser) {
        this.reziser = reziser;
    }

    public void stampaj(){
        System.out.println(this.naziv + ", " + this.godina);

    }
}

