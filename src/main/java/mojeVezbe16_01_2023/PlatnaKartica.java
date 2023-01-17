package mojeVezbe16_01_2023;

public class PlatnaKartica {
    /*atribut suma  - cuva trenutnu sumu novca na kartici u dolarima
    atribut broj kartice  primer: 4012-1239-1221-3381
    atribut godina - godina do kada vazi kartica
    atribut mesec-  mesec do kada vazi kartica*/

    protected double suma;
    protected String brKartice;
    protected int godinaVazenja;
    protected int mesecVazenja;

    /*konstruktor sa parametrima
    gettere za sve atribute, bez settera*/

    public PlatnaKartica(double suma, String brKartice, int godinaVazenja, int mesecVazenja) {
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

    public int getGodinaVazenja() {
        return godinaVazenja;
    }

       public int getMesecVazenja() {
        return mesecVazenja;
    }

   /* metodu dodajSredstva koja povecava sumu za unetu vrednost*/

    public void dodajSredstva(double iznos){
        this.suma = this.suma + iznos;
    }
    /*metodu izvrsiTransakciju koja skida prosledjenu vrednost sa racuna.*/

    public void izvrsiTransakciju(double iznos){
        this.suma = this.suma - iznos;
    }
    /*metodu koja stampa podatke o kartici u formatu:
            4012-1239-1221-3381, 11/2019, $212*/
    public void stampaj(){
        System.out.println(this.brKartice + ", " + this.mesecVazenja + "/" + this.godinaVazenja
        + ", $" + this.suma);
    }


}
