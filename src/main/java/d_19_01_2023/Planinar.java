package d_19_01_2023;

public abstract class Planinar {
//    jedinstveni celobrojni identifikacioni broj
//    ime i prezime

    protected int id;
    protected String imeIPrezime;
//    konstruktor koji postavlja sve atribute klase.
//    gettere i settere
//            (atribute klase nije moguće menjati, nakon inicijalizacije
//             tj. posle njihovog postavljanja u konstruktoru)

    public Planinar(int id, String imeIPrezime) {
        this.id = id;
        this.imeIPrezime = imeIPrezime;
    }

    public int getId() {
        return id;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }
    //    apstraktnu metodu štampaj
    public abstract void stampaj();
//    apstraktnu metodu koja vraca clanarinu planinara
    public abstract double vratiClanarinu();
//    apstraktnu metodu uspesanUspon koja vraća informaciju
//    da li će se planinar upešno popeti na planinu.
    //    Metoda kao ulazni parametar prima objekat tipa Planina.
    public abstract boolean uspesanUspon(Planina planina);



}
