package p16_01_2023;

public class PlatnaKartica {
//    atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
//    atribut broj kartice  primer: 4012-1239-1221-3381
//    atribut godina - godina do kada vazi kartica
//    atribut mesec-  mesec do kada vazi kartica

    protected double suma;
    protected String brKartice;
    protected String godinaVazenja;
    protected String mesecVazenja;

    public PlatnaKartica(double suma, String brKartice, String godinaVazenja, String mesecVazenja) {
        this.suma = suma;
        this.brKartice = brKartice;
        this.godinaVazenja = godinaVazenja;
        this.mesecVazenja = mesecVazenja;
    }

    public double getSuma() {
        return suma;
    }

    public String getBrKartice() {
        return brKartice;
    }

    public String getGodinaVazenja() {
        return godinaVazenja;
    }

    public String getMesecVazenja() {
        return mesecVazenja;
    }
//    metodu dodajSredstva koja povecava sumu za unetu vrednost
    public void dodajSredstva(int vrednost){
        this.suma = this.suma + vrednost;
    }
//    metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.
    public void izvsiTransakciju(double vrednost){
        this.suma = this.suma - vrednost;
    }
//    metodu koja stampa podatke o kartici u formatu:
//            4012-1239-1221-3381, 11/2019, $212
    public void stampaj(){
        System.out.println(this.brKartice +  ", " + this.mesecVazenja + "/" + this.godinaVazenja
                + ", $" + this.suma);
    }

}
