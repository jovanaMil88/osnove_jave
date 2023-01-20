package d_19_01_2023;

public class StaklenaAmbalaza extends Ambalaza{
//    kaucija za flasu
//    atribut koji kaze da li se za flasu placa kaucija
//    osnovna cena

    private double kaucija;
    private boolean placaSeKaucija;
    private double osnovnaCena;
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni

    public StaklenaAmbalaza(String barkod, String naziv,
                            double netoT, double brutoT,
                            double kaucija, boolean placaSeKaucija, double osnovnaCena) {
        super(barkod, naziv, netoT, brutoT);
        this.kaucija = kaucija;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaSeKaucija() {
        return placaSeKaucija;
    }

    public void setPlacaSeKaucija(boolean placaSeKaucija) {
        this.placaSeKaucija = placaSeKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        //    ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//    ako se ne placa, (osnovna cena) * 1.2
        if(placaSeKaucija) {
            return this.osnovnaCena * 1.2 + this.kaucija;
        }
        return this.osnovnaCena * 1.2;
    }

    @Override
    public void stampaj() {
        //    metoda stampaj stampa sve podatke iz klase staklena flasa.
        System.out.println("Tetrapak:");
        System.out.println("Barkod: " + this.barkod);
        System.out.println("naziv: " + this.naziv);
        System.out.println("Neto tezinA: " + this.netoT + ", Bruto tezina: " + this.brutoT);
        if (placaSeKaucija) {
            System.out.println("Kaucija: " + this.kaucija);
        }
        System.out.println("cena: " + this.cenaArtikla());

    }
}
