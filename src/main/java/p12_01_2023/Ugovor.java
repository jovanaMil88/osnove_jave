package p12_01_2023;

public class Ugovor {
    private String datum;
    private FizickoLice prodavac;
    private FizickoLice kupac;
    private double cena;
    private String adresaNekretnine;

    public Ugovor(String datum, FizickoLice prodavac, FizickoLice kupac, double cena, String adresaNekretnine) {
        this.datum = datum;
        this.prodavac = prodavac;
        this.kupac = kupac;
        this.cena = cena;
        this.adresaNekretnine = adresaNekretnine;
    }

    public double vratiProcenat (){
        if (kupac.isJeKupovao()) {
            return 0.02;
        }
        return 0.03;
    }

    public double zaradaAgencije(){
        double zarada = 1000 + cena * this.vratiProcenat();
        return zarada;
    }

    public void stampaj(){
        System.out.print("Dana " + this.datum + "god sklopljen je ugovor izmedju ");
        prodavac.stampaj();
        System.out.print(" i ");
        kupac.stampaj();
        System.out.println(" o kupovini nekretnine " +
                this.adresaNekretnine + " po ceni od  " + this.cena +
                " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od "
                + this.zaradaAgencije());


    }

}
