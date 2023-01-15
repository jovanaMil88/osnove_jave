package d_12_01_2023;

public class Racun {
    private String brRacuna;
    private String imeIprezime;
    private double trenutnoStanje;

    public Racun(String brRacuna, String imeIprezime) {
        this.brRacuna = brRacuna;
        this.imeIprezime = imeIprezime;
    }

    public String getBrRacuna() {
        return brRacuna;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void setBrRacuna(String brRacuna) {
        this.brRacuna = brRacuna;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }
//    metodu koja menja stanje na racunu za prosledjenu vrednost
//            (stanje na racunu ne moze da bude manje od nule)
        public void promeniStanje(double stanje){
        this.trenutnoStanje = stanje;
        }

        public void stampaj(){
            System.out.println(this.imeIprezime + " " + this.brRacuna);
            System.out.println("Stanje na racunu je: " + this.trenutnoStanje + "rsd.");
        }
}
