package d_19_01_2023;

public class Planina {
//    Kreirati klasu Planina koja od privatnih atributa ima:
//    ime planine
//    naziv države u kojoj se nalazi
//    visinu planine.
//    a od javnih metoda:
//    default-ni konstruktor i konstuktor koji postavlja sve parametre
//    gettere i settere za sve atribute
    private String imePlanine;
    private String drzava;
    private double visina;

    public Planina(String imePlanine, String drzava, double visina) {
        this.imePlanine = imePlanine;
        this.drzava = drzava;
        this.visina = visina;
    }

    public Planina() {
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }
}
