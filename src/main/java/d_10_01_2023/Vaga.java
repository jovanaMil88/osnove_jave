package d_10_01_2023;

public class Vaga {
    private String mernaJedinica;
    private ProizvodI p;
    public Vaga(){
    }

    public String getMernaJedinica() {
        return mernaJedinica;
    }

    public ProizvodI getP() {
        return p;
    }

    public void setMernaJedinica(String mernaJedinica) {
        this.mernaJedinica = mernaJedinica;
    }

    public void setP(ProizvodI p) {
        this.p = p;
    }

    public double sracunajCenu(double tezina){
        double cena = 0;
        if (mernaJedinica.equals("kg")) {
            cena = tezina * this.getP().getCenaKg();
        }else if (mernaJedinica.equals("lb")) {
            cena = tezina * this.getP().getCenaLb();
        }else {
            cena = 0;
        }
        return cena;
    }

    public void stampaj(double tezina ){
        this.getP().stampaj();
        if (mernaJedinica.equals("kg")) {
            System.out.println(this.getP().getCenaKg() + " din/" +
                     this.mernaJedinica + " x " + tezina);
            System.out.println("Ukupno: " + this.sracunajCenu(tezina) + " din.");
        }


    }
}
