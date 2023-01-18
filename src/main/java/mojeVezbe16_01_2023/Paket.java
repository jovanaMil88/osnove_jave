package mojeVezbe16_01_2023;

public class Paket {
//    naziv paketa
//    ime i prezime korisnika
//    mesecnu cenu
//    ugovorna obaveza
//    brzina interneta za download
//    brzina interneta za upload
    protected String nazivPaketa;
    protected String korisnik;
    protected double mesecnaCena;
    protected int ugovornaObaveza;
    protected int brzinaZaUpload;
    protected int brzinaZaDownload;

//    getere, setere i konstuktore koji su logicni
//            (brzine interneta nije moguce menjati kao i naziv paketa)

    public String getNazivPaketa() {
        return nazivPaketa;
    }

    public String getKorisnik() {
        return korisnik;
    }

    public double getMesecnaCena() {
        return mesecnaCena;
    }

    public int getUgovornaObaveza() {
        return ugovornaObaveza;
    }

    public int getBrzinaZaUpload() {
        return brzinaZaUpload;
    }

    public int getBrzinaZaDownload() {
        return brzinaZaDownload;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public void setMesecnaCena(double mesecnaCena) {
        this.mesecnaCena = mesecnaCena;
    }

    public void setUgovornaObaveza(int ugovornaObaveza) {
        this.ugovornaObaveza = ugovornaObaveza;
    }

//    public Paket(String nazivPaketa, int brzinaZaUpload, int brzinaZaDownload) {
//        this.nazivPaketa = nazivPaketa;
//        this.brzinaZaUpload = brzinaZaUpload;
//        this.brzinaZaDownload = brzinaZaDownload;
//    }

    public Paket(String korisnik, double mesecnaCena, int ugovornaObaveza) {
        this.korisnik = korisnik;
        this.mesecnaCena = mesecnaCena;
        this.ugovornaObaveza = ugovornaObaveza;
    }

    //    metodu produzi ugovor koja produzava ugovor za 12 meseci
    public void produziUgovor(){
        this.ugovornaObaveza = this.ugovornaObaveza + 12;
    }
//    metodu koja vraca broj meseci koliko korisnik ima po dinar.
//    Uvek vraca nulu
    public int meseciPoDinar(){
        return 0;
    }
//    metodu za stampu koja stampa podatke u formatu:
//    ime i prezime korisnika
//    naziv paketa - brzina download/brzina upload - ugovorna obaveza
//    cena
    public void stampaj(){
        System.out.println("Ime i prezime korisnika: " + this.korisnik);
        System.out.println(this.nazivPaketa + " - " + this.brzinaZaDownload + "/"
        + this.brzinaZaUpload + " - " + this.ugovornaObaveza);
        System.out.println("Cena: " + this.mesecnaCena);
    }





}
