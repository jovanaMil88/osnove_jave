package d_29_12_2022;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezinaGrami;

    public void stampaj() {
        System.out.println(this.naziv + ", " + this.cena + ", " + this.tezinaGrami);
    }

    public void povecajCenu (double povecanje){
        this.cena =  this.cena + povecanje;
    }

    public double vratiCenuSaPopustom (int popust){
        double cenaSaPopustom = this.cena * (1 - (popust / 100.0));
        return cenaSaPopustom;
    }

    public double racunajPostarinu() {
        double postarina = 0;
        if (this.tezinaGrami <= 100) {
            postarina = 200;
        } else if (this.tezinaGrami > 100 && this.tezinaGrami <= 500) {
            postarina = 500;
        } else if (tezinaGrami > 500) {
            postarina = 1000;
        } else {
            postarina = 0;
    }
        return postarina;
    }
        }







