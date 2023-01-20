package d_19_01_2023;

public class Tetrapak extends Ambalaza {
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
   private boolean mozeSeReciklirati;
   private double osnovnaCena;

    public Tetrapak(String barkod, String naziv, double netoT,
                    double brutoT, boolean mozeSeReciklirati, double osnovnaCena) {
        super(barkod, naziv, netoT, brutoT);
        this.mozeSeReciklirati = mozeSeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        //    ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//    ako nije u cenu ulazi samo osnovna cena
        if(mozeSeReciklirati){
        return this.tezina() * 1.5 + this.osnovnaCena;
        }
        return this.osnovnaCena;
    }

    @Override
    public void stampaj() {
        //    metoda stampaj stampa sve podatke iz klase tetrapak
        System.out.println("Tetrapak:");
        System.out.println("Barkod: " + this.barkod);
        System.out.println("naziv: " + this.naziv);
        System.out.println("Neto tezinA: " + this.netoT + ", Bruto tezina: " + this.brutoT);
        if (mozeSeReciklirati) {
            System.out.println("Moze se reciklirati.");
        }else {
            System.out.println("Ne moze se reciklirati.");
        }
        System.out.println("cena: " + this.cenaArtikla());
    }

}
